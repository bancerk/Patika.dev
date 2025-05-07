package week9;

public class Ascii {
    ////American Standard Code for Information Interchange.
    public static void main(String[] args) {
        char a ='A';
        System.out.println(a);
        int ascii = a;
        System.out.println(ascii);
        //
        System.out.println('a'+5);
        System.out.println("correctName(\"deniz\") = " + correctName("Deniz"));
    }
     /*
    Kulanıcıdan alınan ismin ilk harfinin büyük harf ile başlayıp başlamadığını kontrol et,
    Küçük ile başlıyorsa büyük harfe çeviren bir algoritma yaz
     */
    public static String correctName(String name){
        if (name!=null && !name.isEmpty()){
            char firstChar = name.charAt(0);
            if (firstChar >='a' && firstChar<='z'){
              char correctedFirstChar =  (char) (firstChar -32);

              name = correctedFirstChar + name.substring(1);
            }
        }
        return name;
    }
}
