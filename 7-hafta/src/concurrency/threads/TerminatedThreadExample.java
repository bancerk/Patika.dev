package concurrency.threads;

public class TerminatedThreadExample {

    public static void main(String[] args) {

        Thread thread = new Thread(()-> System.out.println("Thread çalışıyor..."));

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state: " + thread.getState());
    }
}
