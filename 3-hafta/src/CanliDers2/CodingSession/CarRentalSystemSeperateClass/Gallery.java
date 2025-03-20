package CanliDers2.CodingSession.CarRentalSystemSeperateClass;

import java.util.ArrayList;
import java.util.List;


// @ Service
public class Gallery {

    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> listCars() {
        return cars;
    }

    public void returnCar(Car carToBeReturned) {
        String plate = carToBeReturned.getPlate();
        for (Car car : cars) {
            if (car.getPlate().equals(plate)) {
                car.setRented(false);
            }
        }
    }

    public void rentCar(Car carToBeRented) {
        String plate = carToBeRented.getPlate();
        for (Car car : cars) {
            if (car.getPlate().equals(plate)) {
                car.setRented(true);
            }
        }
    }
}