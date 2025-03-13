package CanliDers1.stringUtilities;

public class StringMethods {

    public static void main(String[] args) {

        // Doğrudan atama ile (String Literal)
        String metin1 = "Merhaba Java";

// new anahtar kelimesi ile
        String metin2 = new String("Merhaba Java");

// Karakter dizisinden (char array)
        char[] karakterler = {'J', 'a', 'v', 'a'};
        String metin3 = new String(karakterler);

// StringBuilder veya StringBuffer'dan
        StringBuilder sb = new StringBuilder("Merhaba");
        sb.append(" Java");
        String metin4 = sb.toString();

// Boş String oluşturma
        String bosMetin = "";
        String bosMetin2 = new String();


//    ## Temel String İşlemleri

//### Metin Uzunluğu

        String metin = "Merhaba Java";
        int uzunluk = metin.length(); // 12

//### Karakter Erişimi

        metin = "Merhaba";
        char ilkKarakter = metin.charAt(0); // 'M'
        char sonKarakter = metin.charAt(metin.length() - 1); // 'a'

//### Alt Dizeler (Substring)

        metin = "Merhaba Java";
        String altMetin1 = metin.substring(0, 7); // "Merhaba"
        String altMetin2 = metin.substring(8); // "Java"

//### Birleştirme (Concatenation)

// + operatörü ile
        String ad = "Ali";
        String soyad = "Yılmaz";
        String tamAd = ad + " " + soyad; // "Ali Yılmaz"

// concat() metodu ile
        String tamAd2 = ad.concat(" ").concat(soyad); // "Ali Yılmaz"

//### Karşılaştırma


        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

// equals() - içerik karşılaştırması
        boolean esitMi1 = str1.equals(str2); // false
        boolean esitMi2 = str1.equals(str3); // true

// equalsIgnoreCase() - büyük/küçük harf duyarsız karşılaştırma
        boolean esitMiHarfDuyarsiz = str1.equalsIgnoreCase(str2); // true

// == operatörü - referans karşılaştırması (dikkatli kullanın!)
        String a = "Test";
        String b = "Test";
        String c = new String("Test");

        boolean ref1 = (a == b); // true (aynı string havuzu referansı)
        boolean ref2 = (a == c); // false (farklı nesneler)
        boolean icerik = a.equals(c); // true (içerik aynı)

// compareTo() - sözlük sıralaması için
        int karsilastirma1 = "abc".compareTo("def"); // negatif değer
        int karsilastirma2 = "def".compareTo("abc"); // pozitif değer
        int karsilastirma3 = "abc".compareTo("abc"); // 0

//### Arama İşlemleri

        metin = "Java programlama dili";

// indexOf() - karakter veya alt dize arama
        int index1 = metin.indexOf('a'); // 1 (ilk 'a')
        int index2 = metin.lastIndexOf('a'); // 19 (son 'a')
        int index3 = metin.indexOf("prog"); // 5
        int index4 = metin.indexOf("xyz"); // -1 (bulunamadı)

// contains() - içerip içermediğini kontrol etme
        boolean iceriyorMu = metin.contains("programlama"); // true

// startsWith() ve endsWith() - başlangıç ve bitiş kontrolü
        boolean baslarMi = metin.startsWith("Java"); // true
        boolean biterMi = metin.endsWith("dili"); // true

//### Değiştirme İşlemleri


        metin = "Merhaba Java";

// replace() - karakter veya alt dize değiştirme
        String yeniMetin1 = metin.replace('a', 'e'); // "Merhebe Jeve"
        String yeniMetin2 = metin.replace("Java", "Dünya"); // "Merhaba Dünya"

// replaceAll() ve replaceFirst() - regex ile değiştirme
        String yeniMetin3 = "Java1 Java2 Java3".replaceAll("\\d", ""); // "Java Java Java"
        String yeniMetin4 = "Java1 Java2 Java3".replaceFirst("Java", "Python"); // "Python1 Java2 Java3"


//### Boşluk İşlemleri


        String textToTrim = "   Merhaba Java   ";

// trim() - baştaki ve sondaki boşlukları kaldırma
        String kirpilmis = textToTrim.trim(); // "Merhaba Java"

// strip(), stripLeading(), stripTrailing() (Java 11+)
        String temizlenmis = textToTrim.strip(); // "Merhaba Java"
        String basiTemizlenmis = textToTrim.stripLeading(); // "Merhaba Java   "
        String sonuTemizlenmis = textToTrim.stripTrailing(); // "   Merhaba Java"

//### Büyük/Küçük Harf Dönüştürme


        String textToManipulate = "Merhaba Java";

        String buyuk = textToManipulate.toUpperCase(); // "MERHABA JAVA"
        String kucuk = textToManipulate.toLowerCase(); // "merhaba java"


//### Bölme (Split)


        String textToSplit = "Java,Python,C++,JavaScript";

        String[] diller = textToSplit.split(","); // ["Java", "Python", "C++", "JavaScript"]

// Belirli sayıda bölme
        String[] ilkIkiDil = textToSplit.split(",", 2); // ["Java", "Python,C++,JavaScript"]

//### Birleştirme (Join) - Java 8+

        String[] programmingLanguages = {"Java", "Python", "C++", "JavaScript"};
        String birlesik = String.join(", ", programmingLanguages); // "Java, Python, C++, JavaScript"


//### Boş/Null Kontrolü


        String s1 = "";
        String s2 = null;

        boolean bosmu1 = s1.isEmpty(); // true
        boolean bosmu2 = s1.isBlank(); // true (Java 11+)

// NullPointerException'dan kaçınmak için
        boolean bosmu3 = s2 == null || s2.isEmpty(); // true

// Null güvenli yaklaşım
        boolean bosMu = "".isEmpty(); // true
// boolean bosMu2 = null.isEmpty(); // NullPointerException!


//## Format ve İşleme

//### format() ve formatted() (Java 15+)


        String formatli1 = String.format("Merhaba, %s! Bugün %d yaşındasın.", "Ali", 30);
// "Merhaba, Ali! Bugün 30 yaşındasın."

// Java 15+ için formatted()
        String formatli2 = "Merhaba, %s! Bugün %.2f derece.".formatted("Ali", 27.5);
// "Merhaba, Ali! Bugün 27.50 derece."


//### Performans İyileştirmesi için StringBuilder


// Kötü performans (çok fazla String nesnesi oluşturur)
        String sonuc = "";
        for (int i = 0; i < 1000; i++) {
            sonuc += i;
        }

// İyi performans
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(i);
        }
        String sonuc2 = stringBuilder.toString();





    }





}
