package concurrency.threads;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread çalışıyor: " + Thread.currentThread().getName());
    }
}
