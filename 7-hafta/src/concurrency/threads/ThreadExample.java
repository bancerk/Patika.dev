package concurrency.threads;

public class ThreadExample {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        MyThread myThread3 = new MyThread();
        myThread3.start();

        // her çalıştırdığımızda random sıra ile çalışıyor çünkü paralel başlıyorlar

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

        Thread myRunnable2 = new Thread(new MyRunnable());
        myRunnable2.start();

        Thread myRunnable3 = new Thread(new MyRunnable());
        myRunnable3.start();

        // Runnable built in thread methodu
    }
}
