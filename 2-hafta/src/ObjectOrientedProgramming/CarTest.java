package ObjectOrientedProgramming;

public class CarTest {

    public static void main(String[] args) {

        // Sınıf instance = yeni nesne
            Car bmw = new Car(); // nesne oluşturuldu

        bmw.setBrand("BMW");
        bmw.setModel("320");
        bmw.setMaxSpeed(285);
        bmw.setHorsePower(180);

        bmw.move();
        bmw.incrementGear(2);
        int gear = bmw.getGear();

        System.out.println(gear);

        // Vehicle vehicle = new Vehicle(); // soyut class ve interface'den nesne oluşturulamaz

    }
}
