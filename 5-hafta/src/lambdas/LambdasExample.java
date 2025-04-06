package lambdas;

public class LambdasExample {

    public static void main(String[] args) {

        // Java 8 öncesi

        Greeting greeting = new Greeting() {
            @Override
            public void method(String string) {
                System.out.println("Hello " + string);
            }
        };

        greeting.method("cem");

        // Java 8 sonrası

        Greeting greeting1 = (name) -> System.out.println("Hello " + name);

        greeting1.method("cem");

        // method gövdesi ile kullanımı

        Greeting greeting2 = (name) -> {
            System.out.println("Hello " + name);
            System.out.println("Ben bir lambda method'um.");
        };

        greeting2.method("cem");

        // Lambdas
        // (parametre) -> {method gövdesi}
    }
}
