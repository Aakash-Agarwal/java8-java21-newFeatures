package com.learning.research;

import com.learning.research.features.InterfaceDefaultMethodsImplMultiply;
import com.learning.research.features.InterfaceDefaultMethodsImplSum;
import com.learning.research.features.InterfaceStaticMethods;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("Feature 1 - Static methods in interfaces\n");
        InterfaceStaticMethods.sayHello();
        System.out.println("--------------------------------------------\n\n");

        System.out.println("--------------------------------------------");
        System.out.println("Feature 2 - Default methods in interfaces\n");
        System.out.println("This provides a default implementation function.\n" +
                "If any implementing class wants to give it's own version of the function, then it can override this method.\n" +
                "If not overridden, then the default implementation mentioned in the interface will work.\n" +
                "If a class implements two or more such interfaces with the same default method signature," +
                " then the class have to override the method else compilation exception will occur.\n");
        System.out.println(new InterfaceDefaultMethodsImplMultiply().process(5, 6));
        System.out.println(new InterfaceDefaultMethodsImplSum().process(5, 6));
        System.out.println("--------------------------------------------\n\n");
    }
}