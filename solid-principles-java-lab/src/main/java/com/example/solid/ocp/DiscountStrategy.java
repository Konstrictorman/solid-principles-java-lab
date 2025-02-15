package com.example.solid.ocp;

public interface DiscountStrategy {

    double regularClientDiscount(double price);

    double vipClientDiscount(double price);
    
}