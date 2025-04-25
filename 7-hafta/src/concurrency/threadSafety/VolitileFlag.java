package concurrency.threadSafety;

public class VolitileFlag {

    private static volatile boolean flag = false;

    /*
    Using volatile is yet another way (like synchronized, atomic wrapper) of making class thread-safe.
    Thread-safe means that a method or class instance can be used by multiple threads at the same time without any problem.
    Volatile in Java is different from the “volatile” qualifier in C/C++.
    For Java, “volatile” tells the compiler that the value of a variable must never be cached as its value may change outside of the scope of the program itself.
     */

    public static void main(String[] args) {

        new Thread(()->{
            while (!flag){
                //bekliyor
            }
            System.out.println("Flag is true!");
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
    }
}
