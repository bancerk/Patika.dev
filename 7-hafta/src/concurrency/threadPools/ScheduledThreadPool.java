package concurrency.threadPools;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);

        Runnable task = () -> System.out.println("Scheduled task çalışıyor " + System.currentTimeMillis());

        executorService.scheduleAtFixedRate(task, 1, 4, TimeUnit.SECONDS);

    }
}