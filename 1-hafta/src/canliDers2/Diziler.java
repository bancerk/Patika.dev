package canliDers2;

import java.util.Arrays;

public class Diziler {

    public static void main(String[] args) {

        int[] numbers;
        numbers = new int [5];

        int [] scores = new int [10];

        int points [] = {10, 20, 30, 40};

        String[] names = new String[]{"Ali", "Ayşe", "Veli"};

        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        numbers[3] = 400;
        numbers[4] = 500;

        System.out.println(Arrays.toString(numbers));

        int toplam = numbers[0] + numbers[1];
        System.out.println("Toplam: " + toplam);


        for (int i=0; i<numbers.length; i++) {
            System.out.println(i + " : " + numbers[i]);

        }

        // bu iki for döngüsü aynı işe yarıyor

        for (int number : numbers){
            System.out.println(number);

        }

        int[] numbersCopy = new int[5];
        for (int i = 0; i<numbers.length; i++){
            numbersCopy[i] = numbers[i];

        }

        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 800;
        numbers[3] = 900;
        numbers[4] = 500;

        System.out.println("Sıralanmamış dizi: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sıralı dizi: " + Arrays.toString(numbers));


    }
}
