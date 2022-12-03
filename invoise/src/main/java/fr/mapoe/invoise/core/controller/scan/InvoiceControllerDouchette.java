package fr.mapoe.invoise.core.controller.scan;

import fr.mapoe.invoise.core.InvoiceControllerInterface;
import fr.mapoe.invoise.core.entity.Invoice;
import fr.mapoe.invoise.core.service.InvoiceServiceInterface;

//@Controller
public class InvoiceControllerDouchette implements InvoiceControllerInterface {
    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    private InvoiceServiceInterface invoiceService;

    public void createInvoice() {
        System.out.println("Usage of scanner");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("Virgin Galatic");
        invoiceService.createInvoice(invoice);
    }
}