package MathApi;

public class MathApiMain {

    public static void main(String[] args) {

        //iki değer arasında min-max bulma

        System.out.println(Math.min(3,7));

        System.out.println(Math.min(18,-7));

        System.out.println(Math.max(18,-7));

        //yuvarlama - rounding

        System.out.println(Math.round(123.45));
        System.out.println(Math.round(123.50)); // .50'yi yukarı yuvarlar

        System.out.println(Math.pow(5,2)); // kuvvetini alma (üslü sayı hesabı)

        System.out.println(Math.sqrt(25)); // karekök alma

        System.out.println(Math.cbrt(27)); // küp-kök alma ∛27 = 3.0

        //Random sayı gen
        System.out.println(Math.random());


/*Özet Tablosu

abs(x): Mutlak değer döndürür

pow(x, y): x^y üstel işlemi yapar

sqrt(x): Karekök hesaplar

cbrt(x: Küpkök hesaplar

min(x, y): Küçük olanı döndürür

max(x, y): Büyük olanı döndürür

round(x): En yakın tam sayıya yuvarlar

ceil(x): Yukarı yuvarlar

floor(x): Aşağı yuvarlar

sin(x), cos(x), tan(x): Trigonometrik işlemler

toRadians(x), toDegrees(x): Derece ↔ Radyan dönüşümü

exp(x): e^x üstel hesaplama

log(x), log10(x): Logaritma işlemleri

random(): 0.0 - 1.0 arasında rastgele sayı üretir

PI, E: Matematiksel sabitler
*/


    }
}
