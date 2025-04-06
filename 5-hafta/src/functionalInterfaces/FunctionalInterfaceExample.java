package functionalInterfaces;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        MathOperation sum = (number1, number2) -> number1 + number2;
        MathOperation multiply = (a, b) -> a * b;

        //var multiply2 = (a,b) -> a*b; // var tipi belli olmadığı için hata veriyor

        System.out.println("Toplam: " + sum.operate(2,5));
        System.out.println("Çarpım: " + multiply.operate(3,6));
    }
}
