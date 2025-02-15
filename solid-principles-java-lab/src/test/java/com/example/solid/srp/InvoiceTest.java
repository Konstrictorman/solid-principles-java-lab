import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    @Test
    void testInvoiceCreation() {
        Invoice invoice = new Invoice("Máximus", 100.0);
        assertEquals("Máximus", invoice.getCustomer());
        assertEquals(100.0, invoice.getAmount());
    }
}