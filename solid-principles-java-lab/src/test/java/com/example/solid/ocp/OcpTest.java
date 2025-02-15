package com.example.solid.ocp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import com.example.solid.ocp.DiscountStrategy;

public class OcpTest {
    private DiscountCalculator discountCalculator;

    @BeforeEach
    void setUp(){
        discountCalculator = new DiscountCalculator();
    }

    @Test
    void implementsDiscountStrategyInterface(){
        assertTrue(discountCalculator instanceof DiscountStrategy);
    }

    @Test
    void implementsRegularDiscount(){
        assertEquals(discountCalculator.regularClientDiscount(10), 1);
    }

    @Test
    void implementsVIPDiscount(){
        assertEquals(discountCalculator.vipClientDiscount(10), 2);
    }
    
}