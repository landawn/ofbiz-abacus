# Hand-ported typed bodies for AccountingService complex services.
# Imported by gen_accounting_service.py. Each value is a complete method (4-space indented).
# Keep these faithful to OFBiz core semantics; heavier SECA side effects are intentionally omitted.

USED_DAOS = set()  # generator derives DAO fields from referenced tokens; this is informational

CURATED = {

"copyAgreement": '''    public CopyAgreementResponse copyAgreement(CopyAgreementRequest req) throws SQLException {
        String oldId = req.getAgreementId();
        Agreement src = agreementDao.gett(oldId);
        if (src == null) return ServiceResponse.error("Agreement not found: " + oldId, CopyAgreementResponse::new);
        Agreement dup = Beans.copy(src);
        dup.setAgreementId(SequenceUtil.next());
        agreementDao.insert(dup);
        return ServiceResponse.ok(CopyAgreementResponse::new, dup);
    }''',

"copyInvoice": '''    public CopyInvoiceResponse copyInvoice(CopyInvoiceRequest req) throws SQLException {
        String oldId = req.getInvoiceId();
        Invoice src = invoiceDao.gett(oldId);
        if (src == null) return ServiceResponse.error("Invoice not found: " + oldId, CopyInvoiceResponse::new);
        Invoice dup = Beans.copy(src);
        String newId = SequenceUtil.next();
        dup.setInvoiceId(newId);
        invoiceDao.insert(dup);
        for (InvoiceItem item : invoiceItemDao.list(Filters.eq("invoiceId", oldId))) {
            InvoiceItem copy = Beans.copy(item);
            copy.setInvoiceId(newId);
            invoiceItemDao.insert(copy);
        }
        return ServiceResponse.ok(CopyInvoiceResponse::new, dup);
    }''',

"copyInvoiceToTemplate": '''    public CopyInvoiceToTemplateResponse copyInvoiceToTemplate(CopyInvoiceToTemplateRequest req) throws SQLException {
        String oldId = req.getInvoiceId();
        Invoice src = invoiceDao.gett(oldId);
        if (src == null) return ServiceResponse.error("Invoice not found: " + oldId, CopyInvoiceToTemplateResponse::new);
        Invoice dup = Beans.copy(src);
        String newId = SequenceUtil.next();
        dup.setInvoiceId(newId);
        invoiceDao.insert(dup);
        for (InvoiceItem item : invoiceItemDao.list(Filters.eq("invoiceId", oldId))) {
            InvoiceItem copy = Beans.copy(item);
            copy.setInvoiceId(newId);
            invoiceItemDao.insert(copy);
        }
        return ServiceResponse.ok(CopyInvoiceToTemplateResponse::new, dup);
    }''',

"setInvoiceStatus": '''    public SetInvoiceStatusResponse setInvoiceStatus(SetInvoiceStatusRequest req) throws SQLException {
        String invoiceId = req.getInvoiceId();
        Invoice invoice = invoiceDao.gett(invoiceId);
        if (invoice == null) return ServiceResponse.error("Invoice not found: " + invoiceId, SetInvoiceStatusResponse::new);
        String oldStatusId = invoice.getStatusId();
        String newStatusId = req.getStatusId();
        SetInvoiceStatusResponse out = ServiceResponse.ok(SetInvoiceStatusResponse::new);
        out.setInvoiceTypeId(invoice.getInvoiceTypeId());
        out.setOldStatusId(oldStatusId);
        if (newStatusId == null || newStatusId.equals(oldStatusId)) return out;
        if (oldStatusId != null) {
            StatusValidChange probe = new StatusValidChange();
            probe.setStatusId(oldStatusId);
            probe.setStatusIdTo(newStatusId);
            if (statusValidChangeDao.gett(probe) == null)
                return ServiceResponse.error("Invalid invoice status change from " + oldStatusId + " to " + newStatusId, SetInvoiceStatusResponse::new);
        }
        Timestamp statusDate = req.getStatusDate() != null ? req.getStatusDate() : nowTs();
        invoice.setStatusId(newStatusId);
        if ("INVOICE_PAID".equals(newStatusId))
            invoice.setPaidDate(req.getPaidDate() != null ? req.getPaidDate() : statusDate);
        invoiceDao.update(invoice);
        InvoiceStatus hist = new InvoiceStatus();
        hist.setInvoiceId(invoiceId);
        hist.setStatusId(newStatusId);
        hist.setStatusDate(statusDate);
        hist.setChangeByUserLoginId(req.getUserLoginId());
        invoiceStatusDao.insert(hist);
        return out;
    }''',

"setPaymentStatus": '''    public SetPaymentStatusResponse setPaymentStatus(SetPaymentStatusRequest req) throws SQLException {
        String paymentId = req.getPaymentId();
        Payment payment = paymentDao.gett(paymentId);
        if (payment == null) return ServiceResponse.error("Payment not found: " + paymentId, SetPaymentStatusResponse::new);
        String oldStatusId = payment.getStatusId();
        String newStatusId = req.getStatusId();
        SetPaymentStatusResponse out = ServiceResponse.ok(SetPaymentStatusResponse::new);
        out.setOldStatusId(oldStatusId);
        if (newStatusId == null || newStatusId.equals(oldStatusId)) return out;
        if (oldStatusId != null) {
            StatusValidChange probe = new StatusValidChange();
            probe.setStatusId(oldStatusId);
            probe.setStatusIdTo(newStatusId);
            if (statusValidChangeDao.gett(probe) == null)
                return ServiceResponse.error("Invalid payment status change from " + oldStatusId + " to " + newStatusId, SetPaymentStatusResponse::new);
        }
        payment.setStatusId(newStatusId);
        if (payment.getEffectiveDate() == null && ("PMNT_SENT".equals(newStatusId) || "PMNT_RECEIVED".equals(newStatusId)))
            payment.setEffectiveDate(nowTs());
        paymentDao.update(payment);
        return out;
    }''',

"setFinAccountTransStatus": '''    public SetFinAccountTransStatusResponse setFinAccountTransStatus(SetFinAccountTransStatusRequest req) throws SQLException {
        String id = req.getFinAccountTransId();
        FinAccountTrans tx = finAccountTransDao.gett(id);
        if (tx == null) return ServiceResponse.error("FinAccountTrans not found: " + id, SetFinAccountTransStatusResponse::new);
        SetFinAccountTransStatusResponse out = ServiceResponse.ok(SetFinAccountTransStatusResponse::new);
        out.setOldStatusId(tx.getStatusId());
        tx.setStatusId(req.getStatusId());
        finAccountTransDao.update(tx);
        return out;
    }''',

"updateBudgetStatus": '''    public UpdateBudgetStatusResponse updateBudgetStatus(UpdateBudgetStatusRequest req) throws SQLException {
        String budgetId = req.getBudgetId();
        Budget budget = budgetDao.gett(budgetId);
        if (budget == null) return ServiceResponse.error("Budget not found: " + budgetId, UpdateBudgetStatusResponse::new);
        Timestamp statusDate = req.getStatusDate() != null ? req.getStatusDate() : nowTs();
        BudgetStatus hist = new BudgetStatus();
        hist.setBudgetId(budgetId);
        hist.setStatusId(req.getStatusId());
        hist.setStatusDate(statusDate);
        hist.setComments(req.getComments());
        hist.setChangeByUserLoginId(req.getChangeByUserLoginId());
        budgetStatusDao.insert(hist);
        return ServiceResponse.ok(UpdateBudgetStatusResponse::new);
    }''',

"massChangeInvoiceStatus": '''    public MassChangeInvoiceStatusResponse massChangeInvoiceStatus(MassChangeInvoiceStatusRequest req) throws SQLException {
        List<String> ids = req.getInvoiceIds();
        if (ids != null) {
            for (String id : ids) {
                SetInvoiceStatusRequest sub = new SetInvoiceStatusRequest();
                sub.setInvoiceId(id);
                sub.setStatusId(req.getStatusId());
                SetInvoiceStatusResponse r = setInvoiceStatus(sub);
                if (ServiceResponse.isError(r)) return ServiceResponse.errorOf(r, MassChangeInvoiceStatusResponse::new);
            }
        }
        return ServiceResponse.ok(MassChangeInvoiceStatusResponse::new);
    }''',

"massChangePaymentStatus": '''    public MassChangePaymentStatusResponse massChangePaymentStatus(MassChangePaymentStatusRequest req) throws SQLException {
        List<String> ids = req.getPaymentIds();
        if (ids != null) {
            for (String id : ids) {
                SetPaymentStatusRequest sub = new SetPaymentStatusRequest();
                sub.setPaymentId(id);
                sub.setStatusId(req.getStatusId());
                SetPaymentStatusResponse r = setPaymentStatus(sub);
                if (ServiceResponse.isError(r)) return ServiceResponse.errorOf(r, MassChangePaymentStatusResponse::new);
            }
        }
        return ServiceResponse.ok(MassChangePaymentStatusResponse::new);
    }''',

"getInvoiceRunningTotal": '''    public GetInvoiceRunningTotalResponse getInvoiceRunningTotal(GetInvoiceRunningTotalRequest req) throws SQLException {
        BigDecimal total = BigDecimal.ZERO;
        List<String> ids = req.getInvoiceIds();
        if (ids != null) {
            for (String invoiceId : ids) {
                for (InvoiceItem item : invoiceItemDao.list(Filters.eq("invoiceId", invoiceId))) {
                    double qty = item.getQuantity() != 0 ? item.getQuantity() : 1d;
                    total = total.add(BigDecimal.valueOf(item.getAmount()).multiply(BigDecimal.valueOf(qty)));
                }
            }
        }
        GetInvoiceRunningTotalResponse out = ServiceResponse.ok(GetInvoiceRunningTotalResponse::new);
        out.setInvoiceRunningTotal(total.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
        return out;
    }''',

"getPaymentRunningTotal": '''    public GetPaymentRunningTotalResponse getPaymentRunningTotal(GetPaymentRunningTotalRequest req) throws SQLException {
        BigDecimal total = BigDecimal.ZERO;
        List<String> ids = req.getPaymentIds();
        if (ids != null) {
            for (String paymentId : ids) {
                Payment p = paymentDao.gett(paymentId);
                if (p != null) total = total.add(BigDecimal.valueOf(p.getAmount()));
            }
        }
        GetPaymentRunningTotalResponse out = ServiceResponse.ok(GetPaymentRunningTotalResponse::new);
        out.setPaymentRunningTotal(total.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
        return out;
    }''',

"expireRateAmount": '''    public ExpireRateAmountResponse expireRateAmount(ExpireRateAmountRequest req) throws SQLException {
        RateAmount probe = new RateAmount();
        ServiceInput.populate(probe, req);
        RateAmount e = rateAmountDao.gett(probe);
        if (e == null) return ServiceResponse.error("RateAmount not found", ExpireRateAmountResponse::new);
        e.setThruDate(nowTs());
        rateAmountDao.update(e);
        return ServiceResponse.ok(ExpireRateAmountResponse::new, e);
    }''',

"removeFinAccountTransFromReconciliation": '''    public RemoveFinAccountTransFromReconciliationResponse removeFinAccountTransFromReconciliation(RemoveFinAccountTransFromReconciliationRequest req) throws SQLException {
        String id = req.getFinAccountTransId();
        FinAccountTrans tx = finAccountTransDao.gett(id);
        if (tx == null) return ServiceResponse.error("FinAccountTrans not found: " + id, RemoveFinAccountTransFromReconciliationResponse::new);
        tx.setGlReconciliationId(null);
        finAccountTransDao.update(tx);
        return ServiceResponse.ok(RemoveFinAccountTransFromReconciliationResponse::new);
    }''',

"createPaymentAndApplication": '''    public CreatePaymentAndApplicationResponse createPaymentAndApplication(CreatePaymentAndApplicationRequest req) throws SQLException {
        Payment payment = new Payment();
        ServiceInput.populate(payment, req);
        if (Strings.isEmpty(payment.getPaymentId())) payment.setPaymentId(SequenceUtil.next());
        if (payment.getEffectiveDate() == null) payment.setEffectiveDate(nowTs());
        paymentDao.insert(payment);
        PaymentApplication appl = new PaymentApplication();
        ServiceInput.populate(appl, req);
        appl.setPaymentId(payment.getPaymentId());
        if (Strings.isEmpty(appl.getPaymentApplicationId())) appl.setPaymentApplicationId(SequenceUtil.next());
        paymentApplicationDao.insert(appl);
        CreatePaymentAndApplicationResponse out = ServiceResponse.ok(CreatePaymentAndApplicationResponse::new);
        out.setPaymentId(payment.getPaymentId());
        out.setPaymentApplicationId(appl.getPaymentApplicationId());
        return out;
    }''',

}
