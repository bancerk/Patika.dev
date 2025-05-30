package inputOutput.streams.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {

    private String name;
    private int age;
    private Address address;
    private List<String> phoneNumbers;
    private transient String password; // transient keywordu ile serialize edilmiyor Hassas veriler için kullanılır

    public Person(String name, int age, Address address, List<String> phoneNumbers, String password) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                ", password='" + password + '\'' +
                '}';
    }
}
