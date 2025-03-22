package Generics.Wildcards;

import java.util.List;

public class WildcardExample {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,3);

        List<String> stringList = List.of("Java","Python");

        print(integerList);
        print(stringList);

    }

    private static void print(List<?> list){ //wildcard'dan yararlandık
        for(Object object:list){
            System.out.println(object);
        }
    }
}
