# Java 8 New Features

References: 
1. https://www.javatpoint.com/java-8-features
2. https://www.digitalocean.com/community/tutorials/java-8-features-with-examples
3. https://www.baeldung.com/java-8-new-features
4. https://stackoverflow.com/a/45781034

## 1. Functional Interfaces
Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces. It is a new feature in Java, 
that helps to achieve functional programming approach. 

An Interface that contains exactly one abstract method is known 
as functional interface. It can have any number of default, static methods but can contain only one abstract method. 
It can also declare methods of object class. 

Functional Interfaces are extensively used in lambda expressions enabling functional programming in Java.

We don’t need to use @FunctionalInterface annotation to mark an interface as a Functional Interface.
@FunctionalInterface annotation is a facility to avoid the accidental addition of abstract methods in the functional interfaces.

```java
@FunctionalInterface
public interface TestInterface {
    void doSomething();

    default void doneSomething() {
        System.out.println("Exiting functional interface");
    }
}
```

## 2. Static methods in interfaces
Now, just like in any other class, interface can also have static methods. This helps us by eliminating the use of
writing utility classes. Also, interface level utilities can be added as static methods in the interface itself.

```java
public interface InterfaceStaticMethods {
    static void sayHello() {
        System.out.println("This is a static method from InterfaceStaticMethods interface.\n" +
                "This method cannot be overridden and can be directly accessed from anywhere using interface name.\n" +
                "This is similar to any other static method in any other class");
    }
}
```

## 3. Default methods in Interfaces
Just like static methods, interfaces can now have default methods. These default method gives default implementation of
any procedure. In this way the classes that needs to give their implementation will only override this method and rest
all classes do not have worry about if they need the default implementation only. In this way code duplicacy is resolved
as in earlier approach all the implementing classes needs to override this method and give default implementation.

An example interface with default implementation of summing the two numbers.

```java
public interface InterfaceDefaultMethods {
    default int process(int a, int b) {
        System.out.println("Running default process of adding two numbers, " + a + " and " + b);
        return a+b;
    }
}
```

The class for summing the number do not have to override this method.

```java
public class InterfaceDefaultMethodsImplSum implements InterfaceDefaultMethods {

}
```
However, the class for multiplying two numbers will have override and give it's own implementation.

```java
public class InterfaceDefaultMethodsImplMultiply implements InterfaceDefaultMethods {

    @Override
    public int process(int a, int b) {
        System.out.println("Running multiplication process on two numbers, " + a + " and " + b);
        return a*b;
    }
}
```
Note, if any class implements two or more interfaces with same method signature for default methods,
then that class have to override this default method and give it's own implementation, else compile time exception is thrown.

## 4. Lambda Expressions

Lambda expression are a feature in Java 8 that allows us to write more concise and readable code, especially when working
with functional interfaces. Essentially, they are able to treat functionality as a method argument or pass a code block around
for execution.

```java
@FunctionalInterface
public interface TestInterface {
    void doSomething();

    default void doneSomething() {
        System.out.println("Exiting functional interface");
    }
}
```
Prior to Java 8, we would have to create an impl class or anonymous class for the implementation of the abstract method 
defined in the interface.

But now, we would just define the implementation with minimal code, as below

```java
public class Test {
    public void test() {
        TestInterface testInterface = () ->
                System.out.println("Hi from lambda expression providing the impl for a functional interface TestInterface.");

        testInterface.doSomething();
        testInterface.doneSomething();
    }
}
```
Java lambda expression is treated as a function, so the compiler does not create a .class file.

## 5. Method as Reference

Java provides a new feature called method reference in Java 8. Method reference is used to refer method of classes and 
interfaces. It is compact and easy form of lambda expression. Each time when we are using lambda expression to just 
referring a method, we can replace your lambda expression with method reference.

```java
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
```
There are following types of method references in java:

### Reference to a static method.
We will try to refer isEven static method for this class.
```java
public class TestFeature {
    public void test() {
        List<Integer> testList = Arrays.asList(2,3,4,5,6,7,8,9);

        // using static method
        List<Integer> filteredList = testList.stream().filter(TestClass::isEven).collect(Collectors.toList());
        System.out.println("Filtered even list: " + filteredList);
    }
}
```

### Reference to an instance method.
We will try to refer isPrime instance method for this class.
```java
public class TestFeature {
    public void test() {
        List<Integer> testList = Arrays.asList(2,3,4,5,6,7,8,9);

        // using instance method
        TestClass testClass = new TestClass();

        List<Integer> filteredList = testList.stream().filter(testClass::isPrime).collect(Collectors.toList());
        System.out.println("Filtered prime list: " + filteredList);
    }
}
```

### Reference to a constructor
We will try to create instance of this class.
```java
public class TestFeature {
    public void test() {
        List<Integer> testList = Arrays.asList(2,3,4,5,6,7,8,9);

        // using constructor method
        Stream<Double> doubleStream = testList.stream().map(Double::new);
        System.out.println(doubleStream);
    }
}
```