package canliDers.streamApi;

import java.util.ArrayList;

public class Stream01 {
    public static void printNumbers(ArrayList<Integer> list){
        for (Integer w : list){
            System.out.print(w + " ");
        }
    }
    //stream  - forEach
    public static void printNumbers2(ArrayList<Integer> list){
        list.stream().forEach(w-> System.out.print(w+" "));
    }

    public static void printNumbers3(ArrayList<Integer> list){
        list.stream().forEach(System.out::print);
    }
    public static void printNumbers4(ArrayList<Integer> list){
        list.stream().forEach(StreamUtils::yazdir);
    }
    //filter
    //TASK-1: StreamAPI ile list elemanlarinin  cift olanlarını aynı satırda aralarına boşluk bırakarak print ediniz.
    public static void printNumbers5(ArrayList<Integer> list){
        list.stream().filter(t->t%2==0).forEach(StreamUtils::yazdir);
    }
    //TASK-2 StreamAPI ile list elemanlarinin  10'dan küçük cift olanlarını aynı satırda aralarına boşluk bırakarak print ediniz.
    public static void printNumbers6(ArrayList<Integer> list){
        list.stream().filter(t->t%2==0 ).filter(t->t<10).forEach(StreamUtils::yazdir);
    }


}
