package canliDers2.exceptions.unchecked_runtime;

public class UnCheckedException01 {
    public static void main(String[] args) {
        System.out.println("uygulama başladı");

        try {
            int a = 12;
            int b = 6;
            System.out.println(a / b);
            System.out.println("işlem yapılıyor");
        } catch (Exception e) {
            //System.out.println("Hata MEsajı : "+e.getMessage()); // teknik mesajlar verir(özet)
            //e.printStackTrace();//hata ile ilgili dedatylı teknik mesaj verir
            System.err.println("Teknik olmayan mesaj verildi");
        } finally {
            System.out.println("finally blok çalıştı");
        }


        System.out.println("uygulama sona erdi");


    }
}
