package CanliDers1.scope;

public class ClassScope {

    private int sinifDegiskeni = 50; // Sınıf kapsamında bir değişken

    public void metot1() {
        System.out.println(sinifDegiskeni); // Erişilebilir
        sinifDegiskeni = 100; // Değiştirilebilir
    }

    public void metot2() {
        System.out.println(sinifDegiskeni); // Erişilebilir, değer 100 olarak görünür
    }

}
