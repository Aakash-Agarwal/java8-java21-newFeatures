package com.learning.research.features.b_inteface_default_methods;

public interface TestInterface {
    default int process(int a, int b) {
        System.out.println("Running default process of adding two numbers, " + a + " and " + b);
        return a+b;
    }
}
