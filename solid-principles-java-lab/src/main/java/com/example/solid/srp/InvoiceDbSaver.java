public class InvoiceDbSaver {
    public static void saveToDatabase(Invoice invoice) {
        System.out.println("Guardando factura para..." +invoice.getCustomer());
    }
}