package CanliDers2.generics.genericMethod;

import CanliDers2.generics.genericClass.Pair;

public class Utils {
    // Generic metod
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Birden fazla tip parametresi olan generic metod
    public static <T, U> Pair<T, U> makePair(T first, U second) {
        return new Pair<>(first, second);
    }

}
