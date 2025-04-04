package canliDers.abstraction;

public abstract class Animal {
    //concrete metot
    public void breath(){
        System.out.println("patikadev");
    }
    //abstract metot
    public abstract void move();

    /*
    Bir metodu abstract yapmak için
        1-metot body silinmeli
        2-abstract keyword kullanılmalı
        3-abstrqact metotlar yalnızca abstrqact classlarda bulunur.

    Abstract classlardan obje oluşturulamaz
     */
}
