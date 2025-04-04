package canliDers.abstraction;

public class Runner {
    public static void main(String[] args) {
        //Animal animal = new Animal();  //Abstract classlardan obje oluşturulamaz

        Cat cat = new Cat();
        cat.move();
        cat.breath();

        Animal cat1 = new Cat();
        cat1.breath();

        /*TestStatic test = new TestStatic();
        test.add();*/
         TestStatic.add();


    }
}
