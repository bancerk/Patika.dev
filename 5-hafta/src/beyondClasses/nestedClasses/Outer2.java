package beyondClasses.nestedClasses;

public class Outer2 {

    private String message = "message";

    class Inner {

        private String message = "message";


        void innerDisplay(){
            System.out.println("inner class");
        }
    }

    public void outer2Display(){
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.new Inner();
        inner.innerDisplay();
        System.out.println("Outer2 class");
    }

}
