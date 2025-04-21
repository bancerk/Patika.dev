package concurrency.threads;

public class ThreadLifeCycleExample {

    public static void main(String[] args) {

        MyCustomThread myCustomThread = new MyCustomThread(); // 1. New state

        myCustomThread.start(); // 2. Runnable state

        // 3. Running state:
        // CPU uygun bir zamanda myCustomThread'i çalıştırabilir ve Running duruma geçer

    }
}
