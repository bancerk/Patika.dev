package buitInFunctionalInterfaces;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.function.*;

public class BuiltInFunctionalInterfaceExample {

    public static void main(String[] args) {

        // Supplier
        Supplier<LocalDate> localDateSupplier = LocalDate::now; // method reference yöntemi
        LocalDate localDate = localDateSupplier.get();

        Supplier<LocalDate> lambdaSupplier = () -> LocalDate.now(); // lambda ile yazılmış hali
        LocalDate localDate1 = lambdaSupplier.get();

        System.out.println(localDate);
        System.out.println(localDate1);

        // Consumer
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Patika");

        var map = new HashMap<String,Integer>();

        BiConsumer<String,Integer> integerBiConsumer = map::put;
        integerBiConsumer.accept("Patika",7);
        integerBiConsumer.accept("Patika.dev",13);

        System.out.println(map);

        // Predicate - BiPredicate
        Predicate<String> stringPredicate = String::isEmpty;
        System.out.println(stringPredicate.test(""));
        System.out.println(stringPredicate.test("Patika"));

        BiPredicate<String,String> stringStringBiPredicate = String::startsWith;
        System.out.println(stringStringBiPredicate.test("chicken","chi"));
        System.out.println(stringStringBiPredicate.test("chicken","patika"));

        // Function - BiFunction
        Function<String,Integer> stringIntegerFunction = String::length;
        System.out.println(stringIntegerFunction.apply("Patika.dev"));

                    //lambda ile
        Function<String,Integer> lambdaFunction = x -> x.length();
        System.out.println(lambdaFunction.apply("Patika.dev"));

        BiFunction<String,String,String> stringBiFunction = String::concat;
        System.out.println(stringBiFunction.apply("Patika",".dev"));

    }
}
