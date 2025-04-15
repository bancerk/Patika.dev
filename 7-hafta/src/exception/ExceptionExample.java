package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {

        // error'ler programın çalışmasını engelleyecek katastrofik hatalar

        int[] numbers = {1,2,3};
        System.out.println(numbers[5]); // Unchecked exception

        try {
            readFile();
            String name = null;
            System.out.println(name.toUpperCase()); // only catches File not found exception
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Dosya bulunamadı!");
        }
    }

    private static void readFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("test.txt"));
        // Checked exception
    }
}
