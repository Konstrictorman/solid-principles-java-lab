public class InvoiceCalculator {
    public static double calculateTotal(Invoice invoice) {
        return invoice.getAmount() + 1.21;
    }
}