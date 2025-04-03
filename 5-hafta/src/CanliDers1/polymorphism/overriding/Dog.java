package CanliDers1.polymorphism.overriding;


public class Dog extends Animal {
    //overrridng için inheritance şarttır.
    //method bodyt değiştirilir


    @Override
    public void breath() {
        System.out.println("Dog breath metot çalıştı");
    }
}
