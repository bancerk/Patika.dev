package Strings;

public class StringMethods {

    public static void main(String[] args) {

        var s = "Lavanta";

        String flower = "Papatya";

        int flower_length = flower.length();

        System.out.println(flower + " -> " + flower_length + " karakterden oluşmaktadır.");

        char firstIndex = flower.charAt(0);

        System.out.println(firstIndex);

        /* char c = flower.charAt(7); // String out of bounds exception verecek

        yazı karakterlerinden bir index oluşturulduğundan

        ve indexlerde ilk karakter her daim 0'ıncı olarak başladığından,

        7 karakterli bir dizinin sonuncu karakteri 6'ıncıdır.

        */

        System.out.println(flower.indexOf('a'));

        System.out.println(flower.indexOf('a',2));

        System.out.println(flower.substring(3));

        System.out.println(flower.substring(2,5)); // ikinci olarak verilen bitiş indexi kümeye dahil edilmez

    }
}
