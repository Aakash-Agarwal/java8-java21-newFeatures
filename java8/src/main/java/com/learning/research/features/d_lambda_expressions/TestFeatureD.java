package com.learning.research.features.d_lambda_expressions;

import com.learning.research.features.a_functional_interfaces.TestInterface;

public class TestFeatureD {

    public void test() {
        System.out.println("Feature D - Lambda expressions\n");
        System.out.println("A lambda expression is a new and important feature of Java that was included in Java 8.\n" +
                "It provides a concise way to implement Functional interfaces without having to create new impl class.\n" +
                "This new library incorporates a functional programming style to Java.\n");

        TestInterface testInterface = () ->
            System.out.println("Hi from lambda expression providing the impl for a functional interface TestInterface.");

        testInterface.doSomething();
        testInterface.doneSomething();
    }
}
