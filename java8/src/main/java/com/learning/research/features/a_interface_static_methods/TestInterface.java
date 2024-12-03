package com.learning.research.features.a_interface_static_methods;

public interface TestInterface {

    static void sayHello() {
        System.out.println("This is a static method from InterfaceStaticMethods interface.\n" +
                "This method cannot be overridden and can be directly accessed from anywhere using interface name.\n" +
                "This is similar to any other static method in any other class");

    }
}
