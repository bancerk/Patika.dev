package Samples;

public class Car extends Object {

    private String brand;
    private String model;

    public Car () {

    }


    public Car(String brand, String model){ // methodun signiture kısmı
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
