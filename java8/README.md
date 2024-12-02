# Java 8 New Features
## 1. Static and Default methods in interfaces
### 1.1. Static Interface methods
Now, just like in any other class, interface can also have static methods. This helps us by eliminating the use of
writing utility classes. Also, interface level utilities can be added as static methods in the interface itself.

    public interface InterfaceStaticMethods {
        static void sayHello() {
            System.out.println("This is a static method from InterfaceStaticMethods interface.\n" +
                    "This method cannot be overridden and can be directly accessed from anywhere using interface name.\n" +
                    "This is similar to any other static method in any other class");
        }
    }

More info: https://stackoverflow.com/a/45781034, https://www.baeldung.com/java-static-default-methods

### 1.2. Default Interface methods
Just like static methods, interfaces can now have default methods. These default method gives default implementation of
any procedure. In this way the classes that needs to give their implementation will only override this method and rest
all classes do not have worry about if they need the default implementation only. In this way code duplicacy is resolved
as in earlier approach all the implementing classes needs to override this method and give default implementation.

An example interface with default implementation of summing the two numbers.

    public interface InterfaceDefaultMethods {
        default int process(int a, int b) {
            System.out.println("Running default process of adding two numbers, " + a + " and " + b);
            return a+b;
        }
    }

The class for summing the number do not have to override this method.

    public class InterfaceDefaultMethodsImplSum implements InterfaceDefaultMethods {
    
    }

However, the class for multiplying two numbers will have override and give it's own implementation.

    public class InterfaceDefaultMethodsImplMultiply implements InterfaceDefaultMethods {
    
        @Override
        public int process(int a, int b) {
            System.out.println("Running multiplication process on two numbers, " + a + " and " + b);
            return a*b;
        }
    }

Note, if any class implements two or more interfaces with same method signature for default methods,
then that class have to override this default method and give it's own implementation, else compile time exception is thrown.

More Info: https://www.baeldung.com/java-static-default-methods