package canliDers2.generics.genericMethod;

import canliDers2.generics.genericClass.Pair;

public class UtilsExample {

    public static void main(String[] args) {

        // String dizisi
        String[] names = {"Ali", "Veli", "Ayşe", "Fatma"};
        Utils.printArray(names);

// Integer dizisi
        Integer[] numbers = {1, 2, 3, 4, 5};
        Utils.printArray(numbers);

// Pair oluşturma
        Pair<String, Double> product = Utils.<String, Double>makePair("Laptop", 9999.99);
        Pair<Integer, String> entry = Utils.makePair(1, "Birinci"); // Tip çıkarımı

    }

}
