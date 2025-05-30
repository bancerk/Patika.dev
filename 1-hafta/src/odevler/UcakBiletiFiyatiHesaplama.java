package odevler;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan mesafe bilgisi alınıyor
        System.out.println("Mesafeyi km türünden giriniz :");
        int distance = scanner.nextInt();

        // Kullanıcıdan yaş bilgisi alınıyor
        System.out.println("Yaşınızı giriniz :");
        int age = scanner.nextInt();

        double ageDiscount = 0.0;

        // Yaşa göre indirim oranları belirleniyor
        if (age >= 0 && age < 12) {
            ageDiscount = 0.5; // %50 indirim
        } else if (age >= 12 && age < 25) {
            ageDiscount = 0.90; // %10 indirim (1 - 0.90 = 0.10)
        } else if (age >= 25 && age < 65) { // 25-64 yaş arası
            ageDiscount = 1.00; // İndirim yok
        } else if (age >= 65) { // 65 ve üstü
            ageDiscount = 0.70; // %30 indirim
        }

        // Yolculuk tipi seçimi alınıyor
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        int travelType = scanner.nextInt();

        switch (travelType) {
            case 1:{ // Tek Yön
                System.out.println("Toplam Tutar = " + (distance*0.10) * ageDiscount + " TL");
                break;
            }

            case 2:{ // Gidiş-Dönüş
                // İndirimlerin sıralaması: Önce yaş indirimi, sonra %20 ek indirim
                // Formül: (mesafe * 0.10) * 2 (gidiş-dönüş) * yaş indirimi * %20 indirim
                System.out.println("Toplam Tutar = " + (distance*0.10) * 2 * ageDiscount * 0.80 + " TL");
                break;
            }

            default:{
                System.out.println("Hatalı Veri Girdiniz !");
                break;
            }
        }
        scanner.close();
    }
}


/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.

Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.

Mesafe başına ücret 0,10 TL / km olarak alın.

İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.

Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.

Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.

Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.


İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL

Senaryolar

Senaryo 1
Mesafeyi km türünden giriniz : 1500
Yaşınızı giriniz : 20
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2

Toplam Tutar = 216 TL

Senaryo 2
Mesafeyi km türünden giriniz : -500
Yaşınızı giriniz : 1
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77

Hatalı Veri Girdiniz !

Senaryo 3
Mesafeyi km türünden giriniz : 200
Yaşınızı giriniz : 35
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1

Toplam Tutar = 20.0 TL

 */