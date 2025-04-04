package beyondClasses.anonymousClasses;

public class AnonymousExample {

    public static void main(String[] args) {

        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Merhaba, ben anonim bir class'ım !");
            }
        };

        greeting.sayHello();

        //-----------

        Greeting greeting1 = new GreetingImpl();
        greeting1.sayHello();

        //-----------


        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Köpekler havlar.");
            }
        };

        dog.sound();

        Animal animal = new Animal();
        animal.sound();

        //-----------

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonim sınıfta çalışır");
            }
        };

        new Thread(runnable).start();

    }
}
