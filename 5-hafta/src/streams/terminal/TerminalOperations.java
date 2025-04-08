package streams.terminal;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperations {

    public static void main(String[] args) {

        List<String> names = List.of("Ali", "Veli", "Ahmet", "Mehmet", "Ali", "Veli");

        List<String> nameList = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println("nameList = " + nameList);

        // Collect method
        Set<String> uniqueNames = names.stream()
                .collect(Collectors.toSet());
        System.out.println("uniqueNames = " + uniqueNames);

        names.stream()
                .collect(Collectors.toList());

        Map<String, Integer> nameLength = uniqueNames.stream()
                .collect(Collectors.toMap(name -> name, String::length));
        System.out.println("nameLength = " + nameLength);


        // Reduce method
        List<Integer> numbers = List.of(1,2,3,4,5);

        Integer result = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Toplam = " + result);

        Integer multiply = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("multiply = " + multiply);

        Optional<Integer> max = numbers.stream()
                .reduce(Integer::max);
        System.out.println("max = " + max);

        Optional<Integer> min = numbers.stream()
                .reduce(Integer::min);
        System.out.println("min = " + min);

        System.out.println("max:" + max.get() + " - min:" + min.get());

        // Count method
        long count = names.stream()
                .filter(name -> name.length() > 3)
                .count();
        System.out.println("count = " + count);

        // allMatch method
        List<Integer> numberList = List.of(10,20,30,40,50);

        boolean allEven = numberList.stream().allMatch(n -> n % 2 == 0);
        System.out.println("allEven = " + allEven);

        // anyMatch method
        boolean anyGreaterThan25 = numberList.stream()
                .anyMatch(n -> n > 25);
        System.out.println("anyGreaterThan25 = " + anyGreaterThan25);

        // noneMatch method
        boolean noneNegative = numberList.stream()
                .noneMatch(n -> n < 0);
        System.out.println("noneNegative = " + noneNegative);
    }
}
