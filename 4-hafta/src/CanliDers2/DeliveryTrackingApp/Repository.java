package CanliDers2.DeliveryTrackingApp;

import java.util.ArrayList;
import java.util.List;

public class Repository<T extends Delivery> {

    private final List<T> deliveries = new ArrayList<>();
    private int idCounter = 1;

    public void save(T delivery) {
        delivery.setId(idCounter);
        deliveries.add(delivery);
        idCounter++;
    }

    public T findById(int deliveryId) {
        for (T delivery : deliveries) {
            if (delivery.getId() == deliveryId) {
                return delivery;
            }
        }
        return null;
    }

    public boolean delete(int deliveryId) {
        T delivery = findById(deliveryId);
        if (delivery != null) {
            deliveries.remove(delivery);
            return true;
        }
        return false;
    }
}
