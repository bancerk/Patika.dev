package concurrency.threadSafety;

public class SheepManager2 {

    private int sheepCount = 0;

    public synchronized void increment() {
        // syncronized keywordu yalnızca 1 threadin erişimini sağlıyor
        System.out.print((++sheepCount) + " ");
    }

}
