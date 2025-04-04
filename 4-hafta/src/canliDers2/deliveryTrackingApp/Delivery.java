package canliDers2.deliveryTrackingApp;

import java.time.LocalDate;

public class Delivery {

    private int id;
    private String receiver;
    private String sender;
    private String destination;
    private LocalDate pickupDate;
    private boolean delivered;

    public Delivery(String receiver, String sender, String destination) {
        this.receiver = receiver;
        this.sender = sender;
        this.destination = destination;
        this.pickupDate = LocalDate.now();
        this.delivered = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDate pickupDate) {
        this.pickupDate = pickupDate;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "id=" + id +
                ", receiver='" + receiver + '\'' +
                ", sender='" + sender + '\'' +
                ", destination='" + destination + '\'' +
                ", pickupDate=" + pickupDate +
                ", delivered=" + delivered +
                '}';
    }
}
