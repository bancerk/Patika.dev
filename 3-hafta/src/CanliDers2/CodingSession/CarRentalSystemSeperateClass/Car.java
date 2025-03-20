package CanliDers2.CodingSession.CarRentalSystemSeperateClass;

// @Entity
public class Car {

    private String plate;
    private boolean rented;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    @Override
    public String toString() {
        return getPlate() + " palakalı araç";
    }
}