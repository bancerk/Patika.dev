package canliDers2.deliveryTrackingApp;

public class Service {
    private final Repository<Delivery> repository = new Repository<>();

    public void newDelivery(String receiver, String sender, String destination) {
        Delivery delivery = new Delivery(receiver, sender, destination);
        repository.save(delivery);
    }

    public Delivery getDelivery(int deliveryId) {
        return repository.findById(deliveryId);
    }

    public void deliverToAddress(int deliveryId) {
        Delivery delivery = getDelivery(deliveryId);
        delivery.setDelivered(true);
    }

    public boolean changeAddress(int deliveryId, String address) {
        Delivery delivery = getDelivery(deliveryId);
        if (delivery != null) {
            delivery.setDestination(address);
            return true;
        }
        return false;
    }

    public boolean changeReceiver(int deliveryId, String receiver) {
        Delivery delivery = getDelivery(deliveryId);
        if (delivery != null) {
            delivery.setReceiver(receiver);
            return true;
        }
        return false;
    }

    public boolean cancelDelivery(int deliveryId) {
        return repository.delete(deliveryId);
    }
}
