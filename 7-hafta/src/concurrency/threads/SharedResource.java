package concurrency.threads;

public class SharedResource {

    synchronized void method(){
        System.out.println(Thread.currentThread().getName() + " çalışıyor...");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
