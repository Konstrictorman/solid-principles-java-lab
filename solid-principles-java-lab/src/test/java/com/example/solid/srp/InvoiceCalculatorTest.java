import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceCalculatorTest {
    @Test
    void testCalculateTotal() {
        Invoice invoice = new Invoice("Cliente1", 100.0);
        double expectedTotal = 100.0 * 1.21;
        assertEquals(expectedTotal, InvoiceCalculator.calculateTotal(invoice), 0.001);
    }
}
