package CanliDers2.generics.genericClass;

import java.util.ArrayList;
import java.util.List;

public class BoxExample {

    public static void main(String[] args) {

        // String tipinde bir kutu
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Java Generics");
        String content = stringBox.getContent(); // Cast gerekmez

        String lowerCase = content.toLowerCase();

// Integer tipinde bir kutu
        Box<Integer> intBox = new Box<>(42);
        Integer number = intBox.getContent(); // Cast gerekmez


        List<String> stringList = new ArrayList<>();

        List nonGenericList = new ArrayList<>();

        nonGenericList.add("asdfsadf");
        nonGenericList.add(1);

        Object object = nonGenericList.get(0);
        String x = (String) object;

    }

}
