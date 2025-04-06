package lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdasExample2 {

    public static void main(String[] args) {

        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("kangaroo",true,false));
        animals.add(new Animal("rabbit",true,false));
        animals.add(new Animal("turtle",false,true));

        // print(animals, new CheckIfHopper());
        // print(animals, new CheckIfSwimmer());

        // Lambda ile kullanım
        print(animals, a -> a.canHop());
        print(animals, a -> a.canSwim());

        // body ile syntax
        System.out.println("Yüzemeyenler: ");
        print(animals,(a) -> {
            System.out.println("Lambda ifadeleri");
            return !a.canSwim();
        });

        /* Invalid
        var invalid = (Animal animal) -> animal.canHop();
        boolean invalid = (Animal a) -> return a.canHop();
        */

        //valid
        CheckTrait checker = (Animal a) -> a.canHop();
    }

    private static void print(List<Animal> animalList, CheckTrait checker){

        for (Animal animal: animalList){
            if (checker.test(animal)){
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}
