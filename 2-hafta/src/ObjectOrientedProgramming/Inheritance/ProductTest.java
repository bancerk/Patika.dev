package ObjectOrientedProgramming.Inheritance;

public class ProductTest {

    public static void main(String[] args) {

        Elektronik elektronik = new Elektronik();
        elektronik.getName();
        elektronik.getPrice();
        elektronik.setName();
        elektronik.setPrice();

        /*elektronik classından obje oluşturduk
         getName/setName ve getPrice/setPrice özellikleri elektronik class'ında bulunmamasına rağmen
         inheritance yolu ile Product class'ından kullanımımıza açıldı
         */

        elektronik.getWarrantyPeriod();
        elektronik.setWarrantyPeriod();



        Book book = new Book();
        book.setName("Simyacı");
        book.setPrice(255);

    }
}
