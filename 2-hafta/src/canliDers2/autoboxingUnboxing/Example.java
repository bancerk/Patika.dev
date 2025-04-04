package canliDers2.autoboxingUnboxing;

public class Example {

    public static void main(String[] args) {
        // Autoboxing (ilkel tipten wrapper sınıfına otomatik dönüşüm)
        // both 32 bits
        Integer num = 10; // int değeri otomatik olarak Integer nesnesine dönüştürülür Integer.valueOf()
        Integer sayi = Integer.valueOf(15);


// Unboxing (wrapper sınıfından ilkel tipe otomatik dönüşüm)
        int value = num; // Integer nesnesi otomatik olarak int değerine dönüştürülür

        // Java 5 öncesi (manuel dönüşüm)
//        Integer boxedValue = new Integer(42);
//        int primitiveValue = boxedValue.intValue();

// Java 5 ve sonrası (unboxing)
        Integer boxedNum = Integer.valueOf(125);
        int number = boxedNum;  // Integer → int dönüşümü otomatik yapılır

// Aritmetik işlemlerde
        Integer boxedInteger = 50;
        int result = boxedInteger + 20;  // boxedValue önce unbox edilir, sonra toplama yapılır

// Koşul ifadelerinde
        Integer wrapperVal = 100;
        if (wrapperVal > 50) {  // wrapperVal otomatik olarak unbox edilir
            System.out.println("Değer 50'den büyüktür");
        }

    }

}
