package com.learning.research.features.a_functional_interfaces;

public class TestInterfaceImpl implements TestInterface {

    @Override
    public void doSomething() {
        System.out.println("Hi from TestInterfaceImpl which is the impl class for a functional interface TestInterface.");
    }
}
