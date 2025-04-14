package exceptionAndLocalization;

import java.io.FileNotFoundException;

public class ThrowingExceptionExample {

    public static void main(String[] args) {

        // throw new Exception();
        // throw new Exception("Bir hata oluştu!"); // does not compile - previous throw causes unreachable

        // throw RuntimeException(); // does not compile - new keyword missing (throw is an object)

        //method(); // does not compile - add "throws Exception" to method signiture or wrap into try/catch

        try{
            throw new FileNotFoundException("Dosya bulunamadı");
        }catch (Exception e){
            System.out.println(e+ "\n");
            System.out.println(e.getMessage() + "\n");
            e.printStackTrace();
        }
    }

    private static void method() throws FileNotFoundException {
        throw new FileNotFoundException("Dosya bulunamadı");
    }
}
