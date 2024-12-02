package com.learning.research.features;

public interface InterfaceDefaultMethods {
    default int process(int a, int b) {
        System.out.println("Running default process of adding two numbers, " + a + " and " + b);
        return a+b;
    }
}
