package com.learning.research;

import com.learning.research.features.a_interface_static_methods.TestFeatureA;
import com.learning.research.features.b_inteface_default_methods.TestFeatureB;
import com.learning.research.features.c_method_as_a_reference.TestFeatureC;

public class Main {
    public static void main(String[] args) {
//        System.out.println("--------------------------------------------");
//        new TestFeatureA().test();
//        System.out.println("--------------------------------------------\n\n");
//
//        System.out.println("--------------------------------------------");
//        new TestFeatureB().test();
//        System.out.println("--------------------------------------------\n\n");

        System.out.println("--------------------------------------------");
        new TestFeatureC().test();
        System.out.println("--------------------------------------------\n\n");
    }
}