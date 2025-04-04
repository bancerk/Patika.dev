package objectOrientedProgramming.abstraction;

public abstract class Animal {

    //Abstract class

    // doğrudan nesne oluşturulamaz (interface'de olduğu gibi)

    public abstract void makeSound();
    //soyut olduğu için bir body'si yok yani implementation yok
    // bu işin nasıl yapılacağı ile ilgili bilgi yok

    public void sleep(){
        System.out.println("Sleeping...");
    }

}
