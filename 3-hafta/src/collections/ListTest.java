package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        ArrayList <Integer> integers = new ArrayList<>(30);

        ArrayList <Integer> integers1 = new ArrayList<>();

        List <String> shoppingList = new ArrayList<>(); //List'i ArrayList'e çevir

        shoppingList.add("Banana");
        shoppingList.add("Apple");
        shoppingList.add(1,"Mango");
        shoppingList.add("Grapes");
        shoppingList.add("Banana");

        for (String s : shoppingList){
            System.out.println(s);
        }

        boolean isAppleRemoved = shoppingList.remove("Apple");

        System.out.println("isAppleRemoved: " + isAppleRemoved);

        boolean isRemoved =  shoppingList.remove("Ejder meyvesi");

        System.out.println("Ejder meyvesi çıkarıldı mı? : " + isRemoved);



        ArrayList <String> shoppingList2 = new ArrayList<>();
        shoppingList2.add("Milk");


        shoppingList.addAll(shoppingList2);
        System.out.println(shoppingList);

        System.out.println("Sütü ekledik mi ?: " + shoppingList.contains("Milk"));

        System.out.println("Alışveriş listenizde " + shoppingList.size() + " adet ürün var.");

        System.out.println("En son ne ekledik ?: " + shoppingList.getLast());


        // LinkedList

        System.out.println("LinkedList");

        LinkedList<String> linkedList = new LinkedList<>();

        List<String> names = new LinkedList<>();

        names.add("cem");
        names.add("patika");
        names.add("java kursu");

        System.out.println(names);

    }
}
