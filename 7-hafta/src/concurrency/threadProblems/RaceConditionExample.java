package concurrency.threadProblems;

public class RaceConditionExample {

    private int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        RaceConditionExample conditionExample = new RaceConditionExample();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                conditionExample.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                conditionExample.increment();
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // iki thread tek bir resource üzerinde işlem yapıyor

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter: " + conditionExample.getCounter());

        // thread-safe olarak yazmadığımızdan sonucu 2000 beklerken bazen farklı sonuçlar edle edebiliyoruz
    }

    private int getCounter() {
        return counter;
    }

    private void increment() {
        counter++; // Atomic bir işlem değil
    }
}
