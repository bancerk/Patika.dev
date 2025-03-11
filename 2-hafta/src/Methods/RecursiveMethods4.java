package Methods;

import java.util.Scanner;

public class RecursiveMethods4 {

    public static void main(String[] args) {

        // Reversed string example

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir metin giriniz: ");
        String input = scanner.nextLine();

        String reversedString = reverse(input);
        System.out.println(reversedString);

    }

    private static String reverse(String input){
        if(input.isEmpty()) return input;
        return reverse(input.substring(1)) + input.charAt(0);
    }

}
