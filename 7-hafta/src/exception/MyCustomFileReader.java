package exception;

public class MyCustomFileReader implements  AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Kapattık!");
    }
}
