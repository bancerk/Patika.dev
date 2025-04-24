package concurrency.threadSafety;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafetyExample {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(20);

        SheepManager sheepManager = new SheepManager();

        try {
            for (int i = 0; i < 10; i++) {
                service.submit(() -> sheepManager.increment());
            }
        } finally {
            service.shutdown();
        }

    }
}
