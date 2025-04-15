package canliDers.lambda;

public class Lambda01Runner {
    public static void main(String[] args) {
        //classic
        Lambda01.Printer printer1 = new Lambda01.Printer() {
            @Override
            public void print() {
                System.out.println("classic yöntem");
            }
        };
        printer1.print();
        //lambda - tek satır
        Lambda01.Printer printer2 = () -> System.out.println("lambda yöntemi");
        printer2.print();
        //çok satır
        Lambda01.Printer printer3 = ()->
            System.out.println("printing line 1");
            System.out.println("printing line 2");
            System.out.println("printing line 3");

        printer3.print();
        //-------------------------------------------------
        Lambda01.Greeting greeting = name -> {
            System.out.println("test");
            return "Hello " + name;
        };

        System.out.println(greeting.greet("mesut"));
        //------------------------------
        Lambda01.Greeting2 greeting2 = name -> {
            System.out.println(name);
        };
        greeting2.greet("ali");




    }

}
