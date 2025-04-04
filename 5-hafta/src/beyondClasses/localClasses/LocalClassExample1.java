package beyondClasses.localClasses;

public class LocalClassExample1 {

    public void display() {

        class Local {

            void message(){
                System.out.println("Local class !");
            }

        }

        Local local = new Local();
        local.message();

    }

}
