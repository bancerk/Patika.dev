package odevler.selfPracticeSeperateMethodsAndClasses.helloWorldAndSum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Print a greeting
        GreetUser.greetUser();

        Scanner scanner = new Scanner(System.in);

        // Calculate the sum of two numbers

        System.out.println("Please input your first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please input your second number: ");
        int num2 = scanner.nextInt();
        //int sum = num1 + num2;

        int result = CalcSum.calcSum(num1,num2);
        System.out.println("Addition result: " + result);

        scanner.close();
    }
}

