package com.company;

public class Main {
    // instance fields
    String productType;

    // constructor method
    public Main(String product) {
        productType = product;
    }

    // main method
    public static void main (String[] args) {
        Main lemonadeStand = new Main("lemonade");
        System.out.println(lemonadeStand.productType);
    }
}