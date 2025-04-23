package canliDers.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream03 {
    //distinct
    //TASK-1: List elemanlarını alfabetik, büyük harf ve tekrarsız print ediniz
    public static void printNames1(ArrayList<String> list){
        list.stream().map(String::toUpperCase)
                .distinct()
                .sorted()
                .forEach(StreamUtils::yazdirString);
    }
    // Task -2 : list elelmanlarının karakter sayısını ters sıralı olarak tekrarsız prınt ediniz..
    public static void printNames2(ArrayList<String> list){
        list.stream().map(String::length)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(StreamUtils::yazdir);
    }//TODO Mert in sorusu??
    public static void printNamesForMert(ArrayList<String> list){
        list.stream()
                .sorted(Comparator.comparing(String::length))
                .distinct()
                .forEach(StreamUtils::yazdirString);
    }

    //collect
    //Yukarıdaki metodun sonucunu bir list'e aktarınız
    public static List<Integer> printNames3(ArrayList<String> list){
       return list.stream()
                 .map(String::length)
                .sorted(Comparator.reverseOrder())
                .distinct()
                //.collect(Collectors.toList());
               .toList(); // yeni versiyon
    }
    // *********************** anyMatch() *** allMatch() **** noneMatch() ************************
    //anyMatch() --> en az bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.


    // Task-4 : List elelmmalarinin hepsinin karakter sayisinin 4 ve 4 'den az olma durumunu kontrol ediniz.
    public static void harfSayisi4denAz(ArrayList<String> list){
        System.out.println("allMatch " + list.stream().allMatch(t -> t.length() <= 8));
    }

    // Task-5 : List elelmanlarinin hiç birinin "w" ile başlamadığını noneMatch() ile kontrol ediniz.
    public static void wIleBaslamayan(ArrayList<String> list){
        System.out.println("noneMatch : "+  list.stream().noneMatch(t -> t.startsWith("v")));
    }

    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
    public static void xIleBiten(ArrayList<String> list){
        System.out.println("xIleBiten : "+  list.stream().anyMatch(t->t.endsWith("x")));
    }
    //limit - count - skip
    public static void limitCountSkip(ArrayList<String> list){
        System.out.println(list.stream().count());
        list.stream().limit(3).forEach(StreamUtils::yazdirString);
        System.out.println();
        list.stream().skip(1).limit(3).forEach(StreamUtils::yazdirString);
    }
}
