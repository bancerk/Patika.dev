package canliDers.lambda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.*;

public class Built_In_Interfaces {
     /*
    Supplier<T>
    Consumer<T> ve BiConsumer<T, U>
     Predicate<T> ve BiPredicate<T, U>
     Function<T, R> ve BiFunction<T, U, R>
     */
     public static void main(String[] args) {
         //Supplier<T>
         Supplier<String> name =()->"Mesut";
         System.out.println(name.get());

         Supplier<LocalDate> time =()->LocalDate.now();
         System.out.println(time.get());

         //Consumer<T> ve BiConsumer<T, U> //bilateral
         Consumer<String> printName = name2-> System.out.println("Merhaba "+name2);
         printName.accept("velihan");

         BiConsumer<String, Integer> printNameAge = (name3, age) -> System.out.println(name3 +" " + age +" yaşında");
         printNameAge.accept("velihan",25);

        // Predicate<T> ve BiPredicate<T, U>
         /*
         bir değer alır, koşula tabi tutar, boolean olarak return eder.
          */
         Predicate<Integer> isEven =  num -> num % 2 ==0;
         System.out.println(isEven.test(10));

         BiPredicate<String, String> start = (str,prefix) -> str.startsWith(prefix);
         System.out.println(start.test("patika","pad"));
     }
}
