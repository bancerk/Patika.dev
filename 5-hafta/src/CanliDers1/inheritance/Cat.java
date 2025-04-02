package CanliDers1.inheritance;

public class Cat extends Mammal{
    String name="catName";

    public void breath(){
        System.out.println("cat breath() metot çalıştı");
    }

    public Cat() {
    }

    public Cat(String name) {
        super();
        this.name = name;
    }
}
