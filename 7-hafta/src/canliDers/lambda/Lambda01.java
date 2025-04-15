package canliDers.lambda;

public class Lambda01 {
    //@FunctionalInterface
    interface Printer{
        void print();
        //void run(); // yalnızca tek abstract metot olmalı

        //concrete metot olabilir
        public default void run2 (){
            System.out.println();
        }
    }
    @FunctionalInterface
    interface Greeting{
        String greet(String name);
    }
    interface Greeting2{
        void greet(String name);
    }
}
