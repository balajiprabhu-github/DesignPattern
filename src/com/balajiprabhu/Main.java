package com.balajiprabhu;

public class Main {

    public static void main(String[] args) {
        TaxCalculator taxCalculator = calculateTax();
        System.out.println(taxCalculator.calculateTax());
    }

    private static TaxCalculator calculateTax() {
        return new TaxCalculatorQuarterOne();
    }
}
