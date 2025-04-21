package concurrency.threads;

public class WaitingThreadExample {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            synchronized (WaitingThreadExample.class){
                try {
                    WaitingThreadExample.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        // thread waiting state'inde olduğu için bekliyor
    }
}
