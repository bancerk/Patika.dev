package beyondClasses.nestedClasses;

public class Outer {

    static class Nested {

        public void nestedDisplay() {
            System.out.println("Static nested class, public method");
        }

        private void privateNestedDisplay() {
            System.out.println("Static nested class, private method");
        }
    }

    public void outerDisplay(){
            Outer.Nested nested = new Outer.Nested();
            nested.nestedDisplay();;
            nested.privateNestedDisplay();
    }

}

