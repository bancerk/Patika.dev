package functionalInterfaces;

@FunctionalInterface
public interface Greeting {

    void sayHello();

    //functional interface içerisinde birden fazla abstract method olamaz

    default void sayHello2() {
        System.out.println("default method");
    }
}
