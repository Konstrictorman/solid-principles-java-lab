package com.example.solid.dip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class DipTest {
    private OrderProcessor orderProcessor;
    
    @BeforeEach
    void setUp(){
        orderProcessor = new OrderProcessor(new MySQLDatabase());
    }

    @Test 
    void shouldInstantiateWithADBImplementationClass(){
        assertTrue(orderProcessor.getDataBase() instanceof Database); 
    }
}