
package com.example.solid.ocp;

import com.example.solid.ocp.DiscountStrategy;

public class DiscountCalculator implements DiscountStrategy {

    
    public double calculateDiscount(String customerType, double price) {
        if (customerType.equals("Regular")) {
            return regularClientDiscount(price);
        } else if (customerType.equals("VIP")) {
            return vipClientDiscount(price);
        }
        return 0;
    }

    @Override
    public double regularClientDiscount(double price){
        double discount = 0.10;
        return price * discount;
    }

    @Override
    public double vipClientDiscount(double price){
        double discount = 0.20;
        return price * discount;
    }


}