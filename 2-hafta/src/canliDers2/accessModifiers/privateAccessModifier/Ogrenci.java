package canliDers2.accessModifiers.privateAccessModifier;

public class Ogrenci {
    private int ogrenciNo; // Sadece bu sınıf içinden erişilebilir

    // private metot
    private void kimlikDogrula() {
        System.out.println("Kimlik doğrulanıyor: " + ogrenciNo);
        // Bu metoda sadece bu sınıf içinden erişilebilir
    }

    public void ogrenciDogrula() {
//        asfsda
        kimlikDogrula();

//        asdfsaf
    }

    // private değişkene erişim için public metot (getter)
    public int getOgrenciNo() {
        return ogrenciNo;
    }

    // private değişkeni değiştirmek için public metot (setter)
    public void setOgrenciNo(int ogrenciNo) {
        // Burada veri doğrulama işlemleri yapılabilir
        if (ogrenciNo > 0) {
            this.ogrenciNo = ogrenciNo;
        }
    }
}
