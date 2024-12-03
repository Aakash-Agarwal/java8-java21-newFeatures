package com.learning.research.features.d_lambda_expressions;

@FunctionalInterface
public interface TestInterface {
    void doSomething();

    default void doneSomething() {
        System.out.println("Exiting functional interface");
    }
}
