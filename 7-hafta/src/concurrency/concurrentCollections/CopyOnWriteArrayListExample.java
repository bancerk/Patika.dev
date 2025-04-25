package concurrency.concurrentCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    public static void main(String[] args) {

        List<Integer> integerList = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }

        Thread thread1 = new Thread(() -> {
            for (Integer num : integerList) {
                System.out.println("Number: " + num);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            integerList.add(100);
            System.out.println("100 değeri eklendi.");
        });

        thread1.start();
        thread2.start();

    }
}
