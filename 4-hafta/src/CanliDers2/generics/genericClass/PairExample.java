package CanliDers2.generics.genericClass;

public class PairExample {

    public static void main(String[] args) {
        Pair<String, Integer> person = new Pair<>("Ali", 30);
        String name = person.getKey();
        int age = person.getValue();
        System.out.println(name + " " + age + " yaşındadır.");
    }

}
