package concurrency.threadProblems;

public class InterruptExample implements Runnable {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new InterruptExample());

        thread.start();

        Thread.sleep(5000);
        thread.interrupt();
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Çalışıyor...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
                System.out.println("Interrupted.");
            }
        }
    }
}
