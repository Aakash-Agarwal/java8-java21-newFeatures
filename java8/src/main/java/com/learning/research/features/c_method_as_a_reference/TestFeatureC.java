package com.learning.research.features.c_method_as_a_reference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFeatureC {
    public void test() {
        System.out.println("Feature C - Method as argument\n");
        System.out.println("This feature helps us to pass the entire method as an argument in the lambda expression\n" +
                "This helps us in dividing complex lambdas in small manageable functions and then use those functions in the lambdas.\n" );

        List<Integer> testList = Arrays.asList(2,3,4,5,6,7,8,9);

        // using static method
        List<Integer> filteredList = testList.stream().filter(TestClass::isEven).collect(Collectors.toList());
        System.out.println("Filtered even list: " + filteredList);

        // using instance method
        TestClass testClass = new TestClass();

        List<Integer> filteredList2 = testList.stream().filter(testClass::isPrime).collect(Collectors.toList());
        System.out.println("Filtered prime list: " + filteredList2);

        // using constructor method
        Stream<Double> doubleStream = testList.stream().map(Double::new);
        System.out.println(doubleStream);
    }
}
