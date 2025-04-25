package canliDers2.exceptions.custom;

public class Exception01 {
    public static void main(String[] args) throws InvalidAgeException {
        //checkAge(20);
        checkName("mesut");
    }

    //custom Checked exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("yaş 18 altında olamaz");
        } else System.out.println("yaş uygun");
    }

    //custon Runtime(enchecked) exeption
    public static void checkName(String name) {
        if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
            System.out.println("isim uygun");
        } else {
            throw new InvalidNameException("isim uygun değil");
        }
    }
}
