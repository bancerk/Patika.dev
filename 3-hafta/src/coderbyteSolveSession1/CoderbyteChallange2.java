package coderbyteSolveSession1;

import java.util.Scanner;

public class CoderbyteChallange2 {

    public static int PrimeMover (int target) throws IllegalArgumentException{

        if (target < 1 || target > 10000){
            throw new IllegalArgumentException();
        }

        System.out.println("num: " + target);

        int primeNumberCounter = 0;
        int nthPrimeNumber = 0;

        for (int i = 2; primeNumberCounter != target;i++){
            if (isPrime(i)){
                primeNumberCounter++;
                nthPrimeNumber = i;
            }
        }

        return nthPrimeNumber;
    }

    private static boolean isPrime(int number){

        if (number <= 1){
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(PrimeMover(s.nextInt()));

    }

}
