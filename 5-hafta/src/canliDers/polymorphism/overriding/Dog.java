package canliDers.polymorphism.overriding;


public class Dog extends Animal {
    //overriding için inheritance şarttır.
    //method body değiştirilir
    //private, static ve final olan metotlar override edilemez.
    //Overrride işleminde Acc.Modif. belli kurallar çerçevesinde dğişitirilenbişlri.
    // Child classın Acc.Mod. parent class Acc.Mod. kapsayıcı yta da eşit olmalı
    /*
    overloading-> static polymorhism => static metotlar overload edilebildiği için
    overriding-> dinamic polymorhism
     */


    @Override
    public void breath() {
        System.out.println("Dog breath metot çalıştı");
    }

    @Override
     public void move() {
        System.out.println("dog move metot çalıştı");
    }
}
