package beyondClasses.anonymousClasses;

public class GreetingImpl implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("GreetingImpl farklı şekilde selamlar !");
    }
}
