package canliDers.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Stream02 {
    //map
    //TASK-3: StreamAPI ile list elemanlarinin  cift olanlarının KARELERİNİ aynı satırda aralarına boşluk bırakarak print ediniz.
    public static void printNumbers7(ArrayList<Integer> list) {
        list.stream().filter(StreamUtils::ciftBul).map(t -> t * t).forEach(StreamUtils::yazdir);
    }

    //TASK-4: StreamAPI ile list elemanlarinin  tek elemanlarının  küplerinin bir fazlasinı aynı satırda aralarına boşluk bırakarak print ediniz.
    public static void printNumbers8(ArrayList<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> (t * t * t) + 1).forEach(StreamUtils::yazdir);
    }

    //------------------22.04.2025----------------------------
    //REDUCE --
    //Task-5 : Listin en büyük elemanını yazdırınız.
    public static void enBuyukEleman(ArrayList<Integer> list) {
        Optional<Integer> maxEleman = list.stream().reduce(Math::max);
        System.out.println(maxEleman);
        System.out.println(maxEleman.get());//tercih edilmemeli
        maxEleman.ifPresent(System.out::print);//güvenli
    }

    //TASK-6 : Listin çift elemanlarının  karelerinin en büyüğünü print ediniz.
    public static void enBuyukEleman2(ArrayList<Integer> list) {
        Optional<Integer> maxEleman = list.stream()
                .filter(StreamUtils::ciftBul)
                .map(t -> t * t)
                .reduce(Integer::max);
        // System.out.println(maxEleman); // Output: Optional[100]
        // System.out.println(maxEleman.get());  // tercih edilmemeli
        maxEleman.ifPresent(System.out::print);//güvenli
    }

    // TASK-6 : self learning
    public static void enBuyukElemanSelf(ArrayList<Integer> list) {
        Optional<Integer> maxEleman = list.stream()
                .filter(a -> a % 2 == 0)
                .reduce(Integer::max);

        Optional<Integer> maxSquared = maxEleman.map(t -> t * t);
        maxSquared.ifPresent(System.out::print);
    }

    // Task-7: List'teki tum elemanlarin toplamini yazdiriniz.
    public static void topla(ArrayList<Integer> list) {
        int toplam = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("toplam : " + toplam);
    }

    //TAsk -8: Listtteki elemanların çarpımını bul
    public static void carp(ArrayList<Integer> list) {
        Optional<Integer> result = list.stream().reduce(Math::multiplyExact);
        System.out.println(result);
    }

    public static void carp2(ArrayList<Integer> list) {
        int result = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(result);
    }

    //TASK -9: listteki elemanlardan en küçüğünü yazınız
    public static void minEleman(ArrayList<Integer> list) {
        System.out.println("min eleman : " + list.stream().reduce(Math::min));
    }

    //SORTED
    // Task-11 : list'in cift  elemanlarını  kucukten buyuge print ediniz.
    public static void sort(ArrayList<Integer> list) {
        list.stream().filter(StreamUtils::ciftBul)
                //.sorted() // küçükten büyüğe
                .sorted(Comparator.reverseOrder()) // büyükten küçüeğe
                .forEach(StreamUtils::yazdir);
    }
    /*public static void sort2(ArrayList<Integer> list){
      Optional<Integer> res =  list.stream()
                .sorted() // küçükten büyüğe
                .reduce(Math::max);
        System.out.println();
    }*/

}
