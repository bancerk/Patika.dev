package canliDers2.wrapperClasses;

import java.util.ArrayList;

public class Wrappers {

    public static void main(String[] args) {

        /*
    ## İlkel Veri Tipleri ve İlgili Wrapper Sınıfları

| İlkel Veri Tipi | Wrapper Sınıfı |
            |-----------------|----------------|
            | boolean         | Boolean        |
            | char            | Character      |
            | byte            | Byte           |
            | short           | Short          |
            | int             | Integer        |
            | long            | Long           |
            | float           | Float          |
            | double          | Double         |
     */

        // Why do we need

    /*

    Collections Framework Support: Java collections (ArrayList, HashMap, etc.) can only store objects, not primitives.
    Wrapper classes allow primitive values to be stored in collections.


     */

        ArrayList<Integer> numbers = new ArrayList<>();

    /*

    Null Values: Primitives can't be null, but sometimes you need to represent the absence of a value.
    Wrapper classes can hold null.

     */

        Integer nullableNumber = null;  // Valid

    /*

    Utility Methods: Wrapper classes provide helpful methods

     */

        Integer.parseInt("123");  // Converts string to int

    /*

    Constants: Wrapper classes provide useful constants.

     */

        int maxValue = Integer.MAX_VALUE;// 2147483647
        int minValue = Integer.MIN_VALUE;// -2147483648

        /*
        Autoboxing/Unboxing
         */

        Integer i = 10;      // Autoboxing
        int j = Integer.valueOf(20);  // Unboxing


    }



}
