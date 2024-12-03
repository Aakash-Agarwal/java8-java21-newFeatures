package com.learning.research.features.a_functional_interfaces;

@FunctionalInterface
public interface TestInterface {
    void doSomething();

    default void doneSomething() {
        System.out.println("Exiting functional interface");
    }
}
