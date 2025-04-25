package concurrency.threadSafety;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafetyExample2 {

    private static final int TOTAL_SHEEP = 100;
    private static final int THREAD_COUNT = 4;
    private static final AtomicInteger sheepCount = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(THREAD_COUNT);

        Runnable task = () -> {
            for (int i = 0; i < TOTAL_SHEEP / THREAD_COUNT; i++) {
                int currentCount = sheepCount.incrementAndGet();
                System.out.println(Thread.currentThread().getName() + " : Counted Sheep: " + currentCount);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        for (int i = 0; i < THREAD_COUNT; i++) {
            service.execute(task);
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Toplam sayılan koyun: " + sheepCount.get());
    }
}
