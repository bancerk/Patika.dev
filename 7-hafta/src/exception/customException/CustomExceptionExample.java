package exception.customException;

public class CustomExceptionExample {

    public static void main(String[] args) {


        try {
            //throw new MyCustomException("Runtime exception hata mesajım");
            throw new MyCustomException2("Exception hata mesajım");
        } catch (MyCustomException2 e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
