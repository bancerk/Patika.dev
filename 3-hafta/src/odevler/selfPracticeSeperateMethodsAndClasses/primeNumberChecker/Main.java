package odevler.selfPracticeSeperateMethodsAndClasses.primeNumberChecker;

public class Main {

    public static void main(String[] args) {

        int number = 29;
        boolean isPrime = true;

        // 0, 1, and negative numbers are not considered prime
        isPrime = IsItPrime.isItPrime(number,isPrime);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
