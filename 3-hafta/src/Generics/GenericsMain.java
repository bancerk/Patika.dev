package Generics;

public class GenericsMain {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics");

        Box<Boolean> booleanBox = new Box<>();
        booleanBox.setContent(true);

        Box<Animal> animalBox = new Box<>();
        Animal animal = new Animal();
        animalBox.setContent(animal);

        //----------------------------------

        String array[] = {"Java","Python","C++","Javascript"};
        GenericMethodExample.printArray(array);

        Integer array2[] = {1,2,3,4,5};
        GenericMethodExample.printArray(array2);

        //int array3[] = {1,2,3,4,5};
        //GenericMethodExample.printArray(array3); // Compile time error. Çünkü primitive tipler

        //-----------------------------------


        BoundedGenericExample<Animal> animalBoundedGenericExample = new BoundedGenericExample<Animal>();
        animalBoundedGenericExample.setContent(new Animal());

        // BoundedGenericExample<Integer> integerBoundedGenericExample = new BoundedGenericExample<Integer>();
        //Compile time error. Çünkü Animal sınırlandırması var.



    }
}
