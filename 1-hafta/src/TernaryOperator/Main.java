package TernaryOperator;

public class Main {

    public static void main(String[] args) {

        int num = 7;

        String msg = num > 10 ? "Sayı 10'dan büyük" : num > 5 ? "Sayı 5 ile 10 arasında" : "Sayı 5'ten küçük";

        System.out.println(msg);
    }
}
