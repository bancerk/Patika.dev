public class Main {
    public static void main(String[] args) {
        // 1'den 100'e kadar olan sayıları dene
        for (int x = 1; x <= 100; x++) {
            boolean isPrime = true; // rakamın asal sayı olduğunu varsayıyoruz

            // 2'den küçük sayılar asal değildir
            if (x < 2) {
                isPrime = false;
            } else {
                // 2'den sayı/2'ye kadar olan sayılara bölünebilme durumunu kontrol et
                for (int i = 2; i <= x / 2; i++) {
                    if (x % i == 0) {
                        isPrime = false;
                        break; // Bir bölen bulunduğunda looptan çık
                    }
                }
            }

            // Sonucu yazdır
            if (isPrime) {
                System.out.println(x + " asal sayıdır.");
            } else {
                System.out.println(x + " asal sayı değildir.");
            }
        }
    }
}