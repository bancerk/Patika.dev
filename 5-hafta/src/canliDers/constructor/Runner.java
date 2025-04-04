package canliDers.constructor;

public class Runner {
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println(st1.name);

        Student st2 = new Student("velihan");
        System.out.println(st2.name);

    }
}
