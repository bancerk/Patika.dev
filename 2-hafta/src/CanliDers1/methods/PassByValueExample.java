package week2.session1.methods;

public class PassByValueExample {

    public static void main(String[] args) {
        int a = 5;
        System.out.println("Başlangıçtaki değer: " + a);  // 5
        modifyValue(a);  // 'a' değerinin kopyasını gönderiyoruz
        System.out.println("Metod sonrası değer: " + a);  // 5
    }

    public static void modifyValue(int number) {
        number = 10;  // 'number' sadece metotta değişir
        System.out.println("Metod içinde değiştirilen değer: " + number);  // 10
    }
}
