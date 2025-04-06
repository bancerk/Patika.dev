package functionalInterfaces;

import java.util.function.Function;

public class BuiltInFunctionExample {

    public static void main(String[] args) {

        Function<String,Integer> lengthFunction = str -> str.length();

        System.out.println("Kelimenin uzunluğu: " + lengthFunction.apply("Merhaba patika"));
    }
}
