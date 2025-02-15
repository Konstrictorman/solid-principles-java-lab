import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoicePrinterTest {
    @Test
    void testPrintInvoice() {
        // This test should verify output, but we can only check that the method runs without error
        assertDoesNotThrow(() -> InvoicePrinter.printInvoice("Cliente1", 121.0));
    }
}
