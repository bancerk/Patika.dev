package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample1 {

    public static void main(String[] args) {

        String filePath = "text.txt";

        try (var in = new FileInputStream(filePath);
             var out = new FileInputStream("output.txt")) {
            // dosya üzerinde işlemler yapıldı
            // AutoClosable interface'i sayesinde finally bloku yazmadan kullanılan dosyaların kapanmasını sağladık
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        try blokunun scope'u dışında tanım yapmak istersek
        Bu kullanım mümkün değil çünkü tanımı yaparken hata alıyor, try bloku çalışmayacak

        var in = new FileInputStream(filePath);
        try (in) {
            // dosya üzerinde işlemler yapıldı
            // AutoClosable interface'i sayesinde finally bloku yazmadan kullanılan dosyaların kapanmasını sağladık
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}
