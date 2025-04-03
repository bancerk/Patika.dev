package CanliDers.polymorphism.overloading;

public class Cat {
     //overloading aynı nclass içinde olur.
    //overloading için inheritance aranmaz

    public void add() {
        System.out.println("patika");
    }
    public void add(int a) {
        System.out.println("dev");
    }
    public void add(int a, int b) {
        System.out.println("patika");
    }
    public void add(int a, double b) {
        System.out.println("patika");
    }
    public void add( double b, int a) {
        System.out.println("patika");
    }
}
