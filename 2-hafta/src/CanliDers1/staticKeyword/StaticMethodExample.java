package CanliDers1.staticKeyword;

public class StaticMethodExample {

    public static void main(String[] args) {

        // Static metotlar nesne oluşturmadan çağrılabilir
        int sum = MathUtils.add(5, 3);
        int product = MathUtils.multiply(5, 3);

        System.out.println("Sum = " + sum); // 8
        System.out.println("Product = " + product); // 15

        // Non-static metot için nesne oluşturmak gerekir
        MathUtils utils = new MathUtils();
        int difference = utils.subtract(5, 3);
        System.out.println("Difference = " + difference); // 2
    }
}
