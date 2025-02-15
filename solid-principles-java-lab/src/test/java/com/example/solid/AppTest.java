package com.example.solid;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    InvoiceTest.class,
    InvoiceCalculatorTest.class,
    InvoicePrinterTest.class,
    InvoiceDbSaverTest.class
})
public class AppTest {
}
