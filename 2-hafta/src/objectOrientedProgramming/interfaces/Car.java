package objectOrientedProgramming.interfaces;

public class Car implements Vehicle {

    // ozelliklerimiz - fields
    private String brand;
    private String model;
    private int maxSpeed;
    private int horsePower;
    private int maxGearCount = 6;
    private int gear = 0;

    public void move(){
        System.out.println("İleri gidiyoruz");
    }

    public void incrementGear(int gearCount){
        if(maxGearCount >= gearCount){
            this.gear = gearCount;
            System.out.println("Vites şu an " + gear);
        }else System.out.println("Max vites boyutundan fazla giriş yapıldı");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void start() {
        System.out.println("Motor başlatıldı.");
    }
}
