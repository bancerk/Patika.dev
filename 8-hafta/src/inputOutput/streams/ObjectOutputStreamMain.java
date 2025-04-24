package inputOutput.streams;

import inputOutput.streams.model.Address;
import inputOutput.streams.model.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class ObjectOutputStreamMain {

    public static void main(String[] args) {

        Address address = new Address("istanbul", "ana cadde", 12345);
        Person person = new Person("Elif", 28, address, List.of("555-3332211"), "secretKey");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            oos.writeObject(person);
            System.out.println("Person nesnesi yazıldı");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
