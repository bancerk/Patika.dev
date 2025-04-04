package odevler;

import java.util.Scanner;

public class MinMaxDegeriBulma {

    public static void main(String[] args) {

        // Kullanıcıdan veri almak için Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        /*
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
         */

        /*
        Programın Mantığı:
        - Kullanıcıdan bir sayı alır
        - 0'dan bu sayıya kadar olan tüm sayıları kontrol eder
        - Hem 3'e HEM DE 4'e bölünebilen sayıları bulur (12'ye bölünebilme kontrolü ile aynı)
        - Bu sayıların toplamını ve adedini tutar
        - Sonunda ortalamayı hesaplar
         */

        // Kullanıcıdan sayı girişi alınıyor
        System.out.println("Bir sayı giriniz: ");
        int end_num = scanner.nextInt();

        // Toplam ve sayı adedi için değişkenler
        int sum = 0;
        int count = 0;

        // 1'den başlayarak kullanıcının girdiği sayıya kadar döngü

        for (int start = 1; start <= end_num; start++){

            // Sayının hem 3'e hem de 4'e bölünebilmesi kontrolü
            // 12'ye bölünebilme ile aynı anlama gelir (EKOK(3,4)=12)
            if(start % 3 == 0 && start % 4 == 0){ // if (start % 12 == 0)
                sum += start; // Uygun sayıların toplamı
                count++; // Uygun sayıların adedi
            }
        }

        int average = sum / count;

        // Sonucu ekrana yazdırma
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);

        // Scanner nesnesini kapatma (kaynak sızıntısını önlemek için)
        scanner.close();
    }
}