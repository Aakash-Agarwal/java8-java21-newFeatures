package com.learning.research.features.a_functional_interfaces;

public class TestFeatureA {

    public void test() {
        System.out.println("Feature A - Functional interfaces\n");
        System.out.println("Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.\n" +
                "It is a new feature in Java, that helps to achieve functional programming approach.\n" +
                "An Interface that contains exactly one abstract method is known as functional interface.\n" +
                "It can have any number of default, static methods but can contain only one abstract method.\n" +
                "It can also declare methods of object class.\n");
        TestInterface testInterfaceImpl = new TestInterfaceImpl();
        testInterfaceImpl.doSomething();
        testInterfaceImpl.doneSomething();
    }
}
