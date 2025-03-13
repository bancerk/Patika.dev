package Methods.RecursiveMethods;

public class FactorialExample {

    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println("Factorial: " + factorial);
    }

    public static int factorial (int number){
        // 5! = 5.4.3.2.1 = 120
        if(number == 0){
            return 1;
        }

        return number * (factorial(number-1));
    }

}
