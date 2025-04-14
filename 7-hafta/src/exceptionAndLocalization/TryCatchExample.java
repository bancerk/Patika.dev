package exceptionAndLocalization;

import java.io.IOException;

public class TryCatchExample {

    public static void main(String[] args) {

        String[] numbers = {"patika", "2"};

        try {
            // protected code
            // hata alabileceğini düşündüğümüz kod kısmı
            // catch veya finally bloku olmadan tek başına try bloku kullanılamaz

            System.out.println(Integer.parseInt(numbers[3])); // ArrayIndexOutOfBoundsException

            System.out.println(Integer.parseInt(numbers[0])); // NumberFormatException

            method();

        } catch (IOException e) {
            // exception handler
            // birden fazla catch blokuna sahip olabilir

            System.out.println(e.getMessage());
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            // Pipe ile birden fazla exception için aynı catch bloku kullanılabilir

            System.out.println("Parse edilirken hata oluştu!");
        } /*catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array içinde olmayan bir index'e ulaşmak istediniz!");
        }*/
        finally {
            // try bloku çalışıktan sonra hata da alsa her zaman çalışır
            // bu nedenle catch bloklarında en sona konulmalı

            System.out.println("Her zaman çalışır");
        }

        try{
            System.out.println(5 / 0);
        }catch (RuntimeException e){
            System.out.println("RuntimeException!" + e.getMessage());
        }catch (ArithmeticException e){
            // ArithmeticException zaten RuntimeException'ın subclassı
            // Bu nedenle catch bloklarının sıralamasında hata veriyor
            // catch blokları özelden genele doğru gitmelidir

            System.out.println("Bir hata oluştu" + e.getMessage());
        }
    }

    private static void method() throws IOException {
        throw new IOException("bir hata oluştu!");
    }
}
