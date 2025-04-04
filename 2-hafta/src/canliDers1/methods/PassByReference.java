package canliDers1.methods;

public class PassByReference {

    public static void main(String[] args) {
        Person person1 = new Person("Ali", 30);
        System.out.println("Başlangıçtaki değer: " + person1.name + ", " + person1.age);  // Ali, 30

        modifyPerson(person1);  // 'person1' referansının kopyasını gönderiyoruz
        System.out.println("Metod sonrası değer: " + person1.name + ", " + person1.age);  // Veli, 40
    }

    public static void modifyPerson(Person p) {
        p.name = "Veli";  // Nesnenin içeriğini değiştiriyoruz
        p.age = 40;  // Nesnenin içeriğini değiştiriyoruz
    }

}
