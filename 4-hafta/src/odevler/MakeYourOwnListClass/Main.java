package odevler.MakeYourOwnListClass;

public class Main {

    public static void main(String[] args) {

        // Integer türünde bir MyList nesnesi oluşturuluyor
        MyList<Integer> myList = new MyList<>();

        // Listeye iki eleman ekleniyor
        myList.add(10);
        myList.add(20);

        // Listedeki eleman sayısı ekrana yazdırılıyor
        System.out.println("Size: " + myList.size());

        // Listenin kapasitesi ekrana yazdırılıyor
        System.out.println("Capacity: " + myList.getCapacity());
    }
}
