package inputOutput.streams.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class PersonSerialized implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private Address address;
    private String email;
    private List<String> phoneNumbers;
    private transient String password; // transient keywordu ile serialize edilmiyor Hassas veriler için kullanılır

    public PersonSerialized(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonSerialized{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
