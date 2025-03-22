package Odevler.SelfPracticeSeperateMethodsAndClasses.PrimeNUmberChecker;

public class IsItPrime {

    protected static boolean isItPrime(int number, boolean isPrime) {
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check for factors from 2 to number/2
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
