package com.learning.research;

import com.learning.research.features.a_functional_interfaces.TestFeatureA;
import com.learning.research.features.b_interface_static_methods.TestFeatureB;
import com.learning.research.features.c_inteface_default_methods.TestFeatureC;
import com.learning.research.features.d_lambda_expressions.TestFeatureD;
import com.learning.research.features.e_method_as_a_reference.TestFeatureE;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        new TestFeatureA().test();
        System.out.println("--------------------------------------------\n\n");

        System.out.println("--------------------------------------------");
        new TestFeatureB().test();
        System.out.println("--------------------------------------------\n\n");

        System.out.println("--------------------------------------------");
        new TestFeatureC().test();
        System.out.println("--------------------------------------------\n\n");

        System.out.println("--------------------------------------------");
        new TestFeatureD().test();
        System.out.println("--------------------------------------------\n\n");

        System.out.println("--------------------------------------------");
        new TestFeatureE().test();
        System.out.println("--------------------------------------------\n\n");
    }
}