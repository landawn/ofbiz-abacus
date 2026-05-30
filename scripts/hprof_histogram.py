#!/usr/bin/env python3
"""
Stream-parse a JDK HPROF binary heap dump and emit a class-name histogram
(instance count + total shallow bytes per class), like jmap -histo. No
external deps — just enough of the HPROF format to do shallow accounting.

HPROF format reference: OpenJDK heapDumper.cpp (RECORD types).
"""
import struct
import sys
from collections import defaultdict
from pathlib import Path


# Top-level record tags
TAG_STRING = 0x01
TAG_LOAD_CLASS = 0x02
TAG_STACK_FRAME = 0x04
TAG_STACK_TRACE = 0x05
TAG_HEAP_DUMP = 0x0C
TAG_HEAP_DUMP_SEGMENT = 0x1C
TAG_HEAP_DUMP_END = 0x2C

# Sub-records inside HEAP_DUMP / HEAP_DUMP_SEGMENT
SUB_ROOT_UNKNOWN = 0xFF
SUB_ROOT_JNI_GLOBAL = 0x01
SUB_ROOT_JNI_LOCAL = 0x02
SUB_ROOT_JAVA_FRAME = 0x03
SUB_ROOT_NATIVE_STACK = 0x04
SUB_ROOT_STICKY_CLASS = 0x05
SUB_ROOT_THREAD_BLOCK = 0x06
SUB_ROOT_MONITOR_USED = 0x07
SUB_ROOT_THREAD_OBJ = 0x08
SUB_CLASS_DUMP = 0x20
SUB_INSTANCE_DUMP = 0x21
SUB_OBJECT_ARRAY_DUMP = 0x22
SUB_PRIMITIVE_ARRAY_DUMP = 0x23

# JVMTI types inside a class dump (basic-type byte → size in bytes)
BASIC_TYPE_SIZE = {
    2: 0,   # OBJECT — id-size, set from header
    4: 1,   # boolean
    5: 2,   # char
    6: 4,   # float
    7: 8,   # double
    8: 1,   # byte
    9: 2,   # short
    10: 4,  # int
    11: 8,  # long
}


class HprofReader:
    def __init__(self, path):
        self.f = open(path, "rb")
        self.size = Path(path).stat().st_size
        self.id_size = 0
        # id -> string
        self.strings = {}
        # class object id -> class name string id
        self.class_name_id = {}
        # class object id -> shallow instance size (from CLASS_DUMP)
        self.instance_size = {}
        # name -> (instance_count, total_shallow_bytes)
        self.histo_instance = defaultdict(lambda: [0, 0])
        self.histo_obj_array = defaultdict(lambda: [0, 0])
        self.histo_prim_array = defaultdict(lambda: [0, 0])

    def parse_header(self):
        # Format string: nul-terminated, then 4-byte id size, then 8-byte timestamp.
        hdr = b""
        while True:
            b = self.f.read(1)
            if b == b"\x00" or not b:
                break
            hdr += b
        self.id_size = struct.unpack(">I", self.f.read(4))[0]
        BASIC_TYPE_SIZE[2] = self.id_size
        _ts = struct.unpack(">Q", self.f.read(8))[0]
        print(f"  HPROF format: {hdr.decode('utf-8', 'replace')}  id_size={self.id_size}")

    def _read_id(self):
        b = self.f.read(self.id_size)
        if self.id_size == 8:
            return struct.unpack(">Q", b)[0]
        return struct.unpack(">I", b)[0]

    def parse(self):
        self.parse_header()
        bytes_read = self.f.tell()
        last_pct = -1
        while True:
            hdr = self.f.read(9)
            if len(hdr) < 9:
                break
            tag, _ts_micros, length = struct.unpack(">BIi", hdr)
            # `length` is u4 but Java writes signed; treat as unsigned 32-bit
            if length < 0:
                length = length + (1 << 32)
            if tag == TAG_STRING:
                str_id = self._read_id()
                payload = self.f.read(length - self.id_size)
                self.strings[str_id] = payload.decode("utf-8", "replace")
            elif tag == TAG_LOAD_CLASS:
                # class serial number (4) | class object id | stack trace serial (4) | class name string id
                _class_serial = struct.unpack(">I", self.f.read(4))[0]
                class_obj_id = self._read_id()
                _stack_serial = struct.unpack(">I", self.f.read(4))[0]
                class_name_str_id = self._read_id()
                self.class_name_id[class_obj_id] = class_name_str_id
            elif tag in (TAG_HEAP_DUMP, TAG_HEAP_DUMP_SEGMENT):
                self._parse_heap_dump_section(length)
            else:
                # Skip the record body
                self.f.seek(length, 1)
            bytes_read = self.f.tell()
            pct = int(bytes_read * 100 / self.size)
            if pct != last_pct and pct % 5 == 0:
                print(f"  progress: {pct}%  strings={len(self.strings)}  "
                      f"classes={len(self.class_name_id)}  instances={sum(c for c,_ in self.histo_instance.values())}",
                      file=sys.stderr)
                last_pct = pct

    def _parse_heap_dump_section(self, section_length):
        end = self.f.tell() + section_length
        while self.f.tell() < end:
            sub = self.f.read(1)
            if not sub:
                return
            tag = sub[0]
            if tag == SUB_INSTANCE_DUMP:
                obj_id = self._read_id()
                _stack_serial = struct.unpack(">I", self.f.read(4))[0]
                class_obj_id = self._read_id()
                data_len = struct.unpack(">I", self.f.read(4))[0]
                # Shallow size = object header (~16 bytes on 64-bit) + instance fields
                shallow = 16 + data_len
                self.histo_instance[class_obj_id][0] += 1
                self.histo_instance[class_obj_id][1] += shallow
                self.f.seek(data_len, 1)
            elif tag == SUB_OBJECT_ARRAY_DUMP:
                _arr_id = self._read_id()
                _stack_serial = struct.unpack(">I", self.f.read(4))[0]
                n_elems = struct.unpack(">I", self.f.read(4))[0]
                elem_class_id = self._read_id()
                # Shallow size = array header (~24 bytes) + n_elems * id_size
                shallow = 24 + n_elems * self.id_size
                self.histo_obj_array[elem_class_id][0] += 1
                self.histo_obj_array[elem_class_id][1] += shallow
                self.f.seek(n_elems * self.id_size, 1)
            elif tag == SUB_PRIMITIVE_ARRAY_DUMP:
                _arr_id = self._read_id()
                _stack_serial = struct.unpack(">I", self.f.read(4))[0]
                n_elems = struct.unpack(">I", self.f.read(4))[0]
                type_byte = self.f.read(1)[0]
                elem_size = BASIC_TYPE_SIZE.get(type_byte, 0)
                if elem_size == 0:
                    # Unknown type — skip just the size field already consumed
                    return
                shallow = 24 + n_elems * elem_size
                # Use type byte as the bucket key, encoded as `prim[<type>]`
                bucket_key = -type_byte  # negative → primitive-array bucket
                self.histo_prim_array[bucket_key][0] += 1
                self.histo_prim_array[bucket_key][1] += shallow
                self.f.seek(n_elems * elem_size, 1)
            elif tag == SUB_CLASS_DUMP:
                # CLASS_DUMP layout: class obj id | stack trace | super class | classloader | signers | protection | reserved x2
                # | instance size (4) | constant pool size (2) ... we only need instance_size for shallow accounting.
                class_obj_id = self._read_id()
                self.f.seek(4, 1)  # stack trace serial
                for _ in range(6):
                    self._read_id()
                inst_size = struct.unpack(">I", self.f.read(4))[0]
                self.instance_size[class_obj_id] = inst_size
                # Skip constant pool
                cp_size = struct.unpack(">H", self.f.read(2))[0]
                for _ in range(cp_size):
                    self.f.read(2)  # cp index
                    t = self.f.read(1)[0]
                    self.f.seek(BASIC_TYPE_SIZE.get(t, 0), 1)
                # Skip static fields
                static_n = struct.unpack(">H", self.f.read(2))[0]
                for _ in range(static_n):
                    self._read_id()  # name id
                    t = self.f.read(1)[0]
                    self.f.seek(BASIC_TYPE_SIZE.get(t, 0), 1)
                # Skip instance fields
                inst_n = struct.unpack(">H", self.f.read(2))[0]
                for _ in range(inst_n):
                    self._read_id()  # name id
                    self.f.read(1)  # type byte
            elif tag in (SUB_ROOT_JNI_GLOBAL,):
                self._read_id(); self._read_id()
            elif tag in (SUB_ROOT_JNI_LOCAL, SUB_ROOT_JAVA_FRAME):
                self._read_id(); self.f.seek(8, 1)
            elif tag in (SUB_ROOT_NATIVE_STACK, SUB_ROOT_THREAD_BLOCK):
                self._read_id(); self.f.seek(4, 1)
            elif tag in (SUB_ROOT_STICKY_CLASS, SUB_ROOT_MONITOR_USED, SUB_ROOT_UNKNOWN):
                self._read_id()
            elif tag == SUB_ROOT_THREAD_OBJ:
                self._read_id(); self.f.seek(8, 1)
            else:
                print(f"  Unknown sub-tag {tag:#x} at offset {self.f.tell():#x}, aborting heap section",
                      file=sys.stderr)
                return

    def report(self, top=80):
        # Combine instance, object-array, and primitive-array buckets by class name.
        rows = []
        for class_obj_id, (count, total) in self.histo_instance.items():
            name = self.strings.get(self.class_name_id.get(class_obj_id, 0), "?")
            rows.append((name.replace("/", "."), count, total, "obj"))
        for class_obj_id, (count, total) in self.histo_obj_array.items():
            name = self.strings.get(self.class_name_id.get(class_obj_id, 0), "?")
            rows.append(("[L" + name.replace("/", ".") + ";", count, total, "arr"))
        prim_names = {1:"boolean", 2:"char", 3:"float", 4:"double", 5:"byte",
                      6:"short", 7:"int", 8:"long",
                      # Some JDKs use different type bytes; map both encodings
                      -4:"boolean[]", -5:"char[]", -6:"float[]", -7:"double[]",
                      -8:"byte[]", -9:"short[]", -10:"int[]", -11:"long[]"}
        for k, (count, total) in self.histo_prim_array.items():
            rows.append((prim_names.get(k, f"prim[{-k}]"), count, total, "prim"))
        rows.sort(key=lambda r: r[2], reverse=True)

        total_bytes = sum(r[2] for r in rows)
        total_objs = sum(r[1] for r in rows)
        print(f"\n  HISTOGRAM — total shallow {total_bytes/1e9:.2f} GB across {total_objs:,} objects")
        print(f"\n  {'COUNT':>14}  {'BYTES':>14}  {'AVG':>8}  CLASS")
        print(f"  {'-'*14}  {'-'*14}  {'-'*8}  {'-'*60}")
        for name, count, total, _kind in rows[:top]:
            avg = total // count if count else 0
            print(f"  {count:>14,}  {total:>14,}  {avg:>8,}  {name}")

        # Group buckets by interesting prefixes
        print(f"\n  GROUPED BY PACKAGE PREFIX")
        groups = defaultdict(lambda: [0, 0])
        for name, count, total, _kind in rows:
            if name.startswith("com.landawn.abacus.jdbc"):
                key = "com.landawn.abacus.jdbc"
            elif name.startswith("com.landawn.abacus.parser"):
                key = "com.landawn.abacus.parser"
            elif name.startswith("com.landawn.abacus"):
                key = "com.landawn.abacus (other)"
            elif name.startswith("com.landawn.ofbiz"):
                key = "com.landawn.ofbiz"
            elif name.startswith("org.springframework"):
                key = "org.springframework"
            elif name.startswith("java.lang.invoke"):
                key = "java.lang.invoke (lambdas)"
            elif name.startswith("java.util.concurrent"):
                key = "java.util.concurrent"
            elif name.startswith("java.lang.reflect.Proxy") or "$$Lambda" in name or "/0x" in name:
                key = "Proxy/Lambda generated"
            elif name.startswith("java."):
                key = "java.* (other)"
            else:
                key = "other"
            groups[key][0] += count
            groups[key][1] += total
        grouped = sorted(groups.items(), key=lambda x: x[1][1], reverse=True)
        for k, (c, b) in grouped:
            print(f"  {c:>14,}  {b:>14,}  {'-':>8}  {k}")


def main():
    path = sys.argv[1] if len(sys.argv) > 1 else "/tmp/dao-oom.hprof"
    print(f"Parsing {path} ({Path(path).stat().st_size/1e9:.2f} GB)...")
    r = HprofReader(path)
    r.parse()
    r.report()


if __name__ == "__main__":
    main()
