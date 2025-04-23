package canliDers.streamApi;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamRunner {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 4, 6, 7, 7, 9, 10, 10, 13, 17));
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Burak", "abdullah", "cem", "velihan", "selin", "musatafa", "samet", "mesut", "abdullah", "canberk", "burak"));


        /*
        Stream01.printNumbers(nums);
        System.out.println(" //stream  - forEach");
        Stream01 stream = new Stream01();
        stream.printNumbers(nums);
        Stream01.printNumbers2(nums);
        System.out.println(".printNumbers3");
        Stream01.printNumbers3(nums);
        System.out.println("   printNumbers4");
        Stream01.printNumbers4(nums);
        System.out.println("   printNumbers5");
        Stream01.printNumbers5(nums);
        System.out.println("   printNumbers56");
        Stream01.printNumbers6(nums);

        Stream02.printNumbers7(nums);
        System.out.println();
        Stream02.printNumbers8(nums);
        Stream02.enBuyukEleman(nums);
        Stream02.enBuyukEleman2(nums);
        System.out.println();
        Stream02.topla(nums);
        System.out.println();
        Stream02.carp(nums);
        Stream02.carp2(nums);
        Stream02.minEleman(nums);
        System.out.println("sort ");
        Stream02.sort(nums);

        Stream03.printNames1(list);
        System.out.println();
        Stream03.printNames2(list);
        System.out.println("mertin sorusu");
        Stream03.printNamesForMert(list);
        System.out.println();
        System.out.println(Stream03.printNames3(list));
        Stream03.harfSayisi4denAz(list);
        System.out.println();
        Stream03.wIleBaslamayan(list);
        System.out.println();
        Stream03.xIleBiten(list);
        System.out.println();
        Stream03.limitCountSkip(list);
         */

        Stream02.enBuyukEleman2(nums);
        System.out.println();
        Stream02.enBuyukElemanSelf(nums);

    }
}
