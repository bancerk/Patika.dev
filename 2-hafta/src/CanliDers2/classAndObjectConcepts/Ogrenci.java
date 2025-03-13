package CanliDers2.classAndObjectConcepts;

public class Ogrenci {

    public int no;
    public String name;

    public Ogrenci() {
        System.out.println("Default constructor çalıştırıldı");
    }

    public Ogrenci(int no, String name) {
        this();
        this.no = no;
        this.name = name;
        System.out.println("Parametrik yapıcı metod çağrıldı");
    }

}
