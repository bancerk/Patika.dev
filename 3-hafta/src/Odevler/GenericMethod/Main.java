package Odevler.GenericMethod;

public class Main {

    public static void main(String[] args) {

        // Integer türünde bir dizi oluşturuyoruz
        Integer[] intArray = {1, 2, 3, 4, 5};

        // String türünde bir dizi oluşturuyoruz
        String[] strArray = {"Java", "Generics", "Ödev"};

        // Integer dizisini ekrana yazdırmak için generic metodu çağırıyoruz
        printArray(intArray);

        // String dizisini ekrana yazdırmak için generic metodu çağırıyoruz
        printArray(strArray);

    }

    // Generic metod tanımı: Her türden dizi elemanını ekrana yazdırabilir
    protected static <T> void printArray(T[] array) {
        // Dizi elemanlarını tek tek yazdırıyoruz
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Her diziden sonra yeni satır
    }
}
