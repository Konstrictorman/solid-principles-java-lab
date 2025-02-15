import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceDbSaverTest {
    @Test
    void testSaveToDatabase() {
        InvoiceDbSaver saver = new InvoiceDbSaver();
        Invoice invoice = new Invoice("Cliente1", 100.0);
        assertDoesNotThrow(() -> saver.saveToDatabase(invoice));
    }
}
