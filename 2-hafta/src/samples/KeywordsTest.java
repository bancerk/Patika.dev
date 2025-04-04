package samples;

public class KeywordsTest {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.getModel());
        System.out.println(car.getBrand());

        Car car1 = new Car("BMW");
        System.out.println(car.getModel());
        System.out.println(car.getBrand());

        Car car2 = new Car("BMW", "320");
        System.out.println(car.getModel());
        System.out.println(car.getBrand());

        // ----

        System.out.println("super & this keywordsl");

        Child child = new Child("message");

    }
}
