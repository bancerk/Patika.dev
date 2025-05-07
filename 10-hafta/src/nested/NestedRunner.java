package week9.nested;

public class NestedRunner {
    public static void main(String[] args) {
        Outer1 out1 = new Outer1();
        System.out.println("out1.a = " + out1.a);

        Outer1.Inner1 inn1 = new Outer1.Inner1();
        System.out.println("inn1.a = " + inn1.a);

       Outer2 out2 = new Outer2();
        Outer2.Inner2 inn2 = out2.new Inner2();
        System.out.println("inn2.b = " + inn2.b);


    }
}
