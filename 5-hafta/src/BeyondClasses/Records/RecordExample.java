package BeyondClasses.Records;

import java.util.List;

public class RecordExample {

    public static void main(String[] args) {

        Point point = new Point(3,4);
        System.out.println(point);

        Point point1 = new Point(3,3);
        System.out.println(point1);

        System.out.println("Rectangle Records");

        Rectangle rectangle = new Rectangle(3,4);
        System.out.println("Alan: " + rectangle.area());

        System.out.println("Bird Records");

        var mommy = new Bird(4,"Mavis");
        System.out.println(mommy.name() + " " + mommy.numberEggs());

        var child = new Bird(0,"Sari");
        // child.name = "Lacivert";
        // Record'lar immutable olduğundan sonradan parametrelerde değişiklik yapılamaz

        System.out.println("");
        List.of(mommy.getClass().getDeclaredMethods()).forEach(System.out::println);

        System.out.println("");
        List.of(mommy.getClass().getDeclaredConstructors()).forEach(System.out::println);

        System.out.println("");

        var child2 = new Bird(0,"Lacivert","Laci");
        System.out.println(child2);

    }
}
