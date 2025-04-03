package CanliDers.inheritance;

public class Runner {
    /*
    1-single
    2-multilevel
    3-hierechical
    4-multiple
     */
    public static void main(String[] args) {
      Cat cat1 = new Cat();
        System.out.println(cat1.name);
       cat1.breath();

       Cat cat2 = new Cat();
        System.out.println(cat2.name);

        Animal cat3 = new Cat();
        System.out.println(cat3.name);

        Cat cat4 = new Cat();
        cat4.breath();




    }
}
