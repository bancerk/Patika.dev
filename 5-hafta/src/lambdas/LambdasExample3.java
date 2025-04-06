package lambdas;

public class LambdasExample3 {

    public static void main(String[] args) {

        // Old school implementation

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable çalışıyor...");
            }
        };

        new Thread(runnable).start();

        //With Lambda

        Runnable runnable1 = () -> System.out.println("Runnable çalışıyor...");

        new Thread(runnable1);
    }
}
