package methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferenceExample {

    public static void main(String[] args) {

        // 1. static method reference -> ClassName::methodName
        // 2. instance method reference -> objectReference::instanceMethod
        // 3. instance method reference(Sınıf üzerinden) -> ClassName:: methodName
        // 4. constructor method reference -> CLassName::new


        // 1. static method reference -> ClassName::methodName

        BiFunction<Integer, Integer, Integer> sum = MathOperations::sum;
        System.out.println("Toplam: " + sum.apply(5,9));

        // 2. instance method reference -> objectReference::instanceMethod

        Printer printer = new Printer();
        Consumer<String> stringConsumer = printer::print;
        stringConsumer.accept("Merhaba method reference");

        // 3. instance method reference(Sınıf üzerinden) -> ClassName:: methodName

        List<String> names = Arrays.asList("Ahmet","Veli","Ayşe","Fatma");
        names.forEach(System.out::println);

        // 4. constructor method reference -> CLassName::new

        Supplier<Car> carSupplier = Car::new;
        carSupplier.get();
        // Car car = carSupplier.get();

    }
}
