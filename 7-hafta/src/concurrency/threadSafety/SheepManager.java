package concurrency.threadSafety;

public class SheepManager {

    private int sheepCount = 0;

    public synchronized void increment() {
        // syncronized keywordu yalnızca 1 threadin erişimini sağlıyor
        System.out.print((++sheepCount) + " ");
    }

    public void increment2() {
        synchronized (this) {
            System.out.print((++sheepCount) + " ");
        }
    }
}
