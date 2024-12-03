package com.learning.research.features.e_method_as_a_reference;

public class TestClass {

    public static boolean isEven(int input) {
        return input % 2 == 0;
    }

    public boolean isPrime(int input) {
        if (input != 2) {
            for (int i = 2; i < input; i++) {
                if (input % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
