package com.learning.research.features.c_inteface_default_methods;

public class TestFeatureC {

    public void test() {
        System.out.println("Feature B - Default methods in interfaces\n");
        System.out.println("This provides a default implementation function.\n" +
                "If any implementing class wants to give it's own version of the function, then it can override this method.\n" +
                "If not overridden, then the default implementation mentioned in the interface will work.\n" +
                "If a class implements two or more such interfaces with the same default method signature," +
                " then the class have to override the method else compilation exception will occur.\n");
        System.out.println(new TestInterfaceImplMultiply().process(5, 6));
        System.out.println(new TestInterfaceImplSum().process(5, 6));
    }
}
