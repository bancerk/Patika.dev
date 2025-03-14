package ObjectOrientedProgramming.Polymorphism;

import java.util.Scanner;

public class ShapeAreaCalc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hangi şeklin alanını hesaplamak istersin ?");

        System.out.println("1. Daire \n2. Kare \n3. Üçgen");

        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice){

            case 1:
                System.out.println("Dairenin yarıçapını girin:");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;

            case 2:
                System.out.println("Karenin kenar uzunluğunu girin:");
                double side = scanner.nextDouble();
                shape = new Square(side);
                break;

            case 3:
                System.out.println("Üçgenin taban uzunluğunu girin:");
                double base = scanner.nextDouble();
                System.out.println("Üçgenin yüksekliğini girin:");
                double height = scanner.nextDouble();
                shape = new Triangle(base,height);
                break;

            default:
                System.out.println("Hatalı giriş yaptınız!");
        }

        double calclatedArea = shape.calculateArea();
        System.out.println("Alan= " + calclatedArea);

    }

}
