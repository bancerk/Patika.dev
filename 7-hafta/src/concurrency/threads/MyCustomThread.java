package concurrency.threads;

public class MyCustomThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread çalışıyor...");
    }
}
