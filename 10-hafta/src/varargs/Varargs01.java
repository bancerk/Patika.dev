package week9.varargs;

public class Varargs01 {
    public static void main(String[] args) {
        //System.out.println("add(1,3,6,9) = " + add(1, 3, 6, 9));
        System.out.println("add(1,2) = " + add(1, 2));
        System.out.println("add(1,2,6) = " + add(1, 2, 6));
        System.out.println("add(1,8,9,7,9,6) = " + add(1, 8, 9, 7, 9, 6));
    }
    /*
    //2 saayının toplamını veren kodu yazınız
    public static int add(int a, int b){
        return a+b;
    }
    //3 saayının toplamını veren kodu yazınız
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    //4 saayının toplamını veren kodu yazınız
    public static int add(int a, int b, int c, int d){
        return a+b+c;
    }*/
    //VARARGS - > variable arguments
    //varargs arka planda array yapısını kullanır
    //parametreye ikinci parametre yazılabilr ancak varargs yapısı sonda olmalı
    public static int add(int... a){
        int sum = 0;
        for (int w : a){
            sum +=w;
        }
        return sum;
    }
}
