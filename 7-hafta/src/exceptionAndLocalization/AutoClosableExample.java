package exceptionAndLocalization;

public class AutoClosableExample {

    public static void main(String[] args) {

        // runtime'da çalışma örneği

        try (MyCustomFileReader myCustomFileReader = new MyCustomFileReader()) {
            System.out.println("Try bloku");
        } catch (Exception e) {
            System.out.println("Catch bloku");
        } finally {
            System.out.println("finally bloku");
        }
    }
}
