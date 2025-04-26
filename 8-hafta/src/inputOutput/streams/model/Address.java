package inputOutput.streams.model;

import java.io.Serial;
import java.io.Serializable;

public class Address implements Serializable {

    private String city;
    private String street;
    private int zipcode;

    public Address(String city, String street, int zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
