package com.learning.research.features;

public class InterfaceDefaultMethodsImplMultiply implements InterfaceDefaultMethods {

    @Override
    public int process(int a, int b) {
        System.out.println("Running multiplication process on two numbers, " + a + " and " + b);
        return a*b;
    }
}
