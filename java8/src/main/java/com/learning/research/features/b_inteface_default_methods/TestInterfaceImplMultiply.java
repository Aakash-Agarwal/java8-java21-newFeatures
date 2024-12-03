package com.learning.research.features.b_inteface_default_methods;

public class TestInterfaceImplMultiply implements TestInterface {

    @Override
    public int process(int a, int b) {
        System.out.println("Running multiplication process on two numbers, " + a + " and " + b);
        return a*b;
    }
}
