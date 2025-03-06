package CanliDers2;

public class Casting {

    public static void main(String[] args) {

        byte b = 10;

        int i = b;
        System.out.println("i: " + i);

        int i1 = 10000;
        double d = i1;

        double d2 = 35.45;
        i1 = (int) d2;

        System.out.println("i1: " + i1);

        String sayi = "100";
        int tamSayi = Integer.parseInt(sayi);

        System.out.println("tamsayi: " + tamSayi);

        String ondalikSayi = "45.67";
        double sayi2 = Double.parseDouble(ondalikSayi);
        System.out.println("ondalikSayi: " + sayi2);

        String yaziDegeri = String.valueOf(tamSayi);
        System.out.println("Yaazı değeri: " + yaziDegeri);

        float f = 12.34F;


    }
}
