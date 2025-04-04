package switchCase;

import java.util.Scanner;

public class SwitchCaseMain2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        double num1 = scanner.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        double num2 = scanner.nextDouble();

        System.out.println("İşlem seçiniz (+,-,*5,/): ");

        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
            System.out.println("Sonuç: " + (num1+num2) );
            break;
            case '-':
            System.out.println("Sonuç: " + (num1-num2) );
            break;
            case '*':
            System.out.println("Sonuç: " + (num1*num2) );
            break;
            case '/':
                if (num2 != 0){
                System.out.println("Sonuç: " + (num1/num2) );}
                else{
                    System.out.println("İkinci sayı bölme işleminde 0 olamaz!");}
            break;
            default:
            System.out.println("Geçersiz işlem!");
            break;
        }
    scanner.close();
    }

}
