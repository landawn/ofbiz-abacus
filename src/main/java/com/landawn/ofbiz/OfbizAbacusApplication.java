package com.landawn.ofbiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OfbizAbacusApplication {

    public static void main(String[] args) {
        // Fully disable the devtools RestartClassLoader. It must be set as a System property
        // before run() — setting spring.devtools.restart.enabled in application.yml only stops
        // file-watching, leaving the restart classloader installed, which makes abacus-jdbc
        // DAO-proxy creation pathologically slow (eager boot: ~60x slower, gaps to 80s, OOM-bound).
        // Harmless in production where devtools is not on the classpath.
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(OfbizAbacusApplication.class, args);
    }
}
