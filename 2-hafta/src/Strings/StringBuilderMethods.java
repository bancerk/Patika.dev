package Strings;

public class StringBuilderMethods {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("patika");

        System.out.println(stringBuilder);

        /* Stringler immutable - değiştirilemezdir
        sadece methodları kullanarak ekrana çıktı verilen değerleri manipule edebiliriz
        lakin objenin kendi içerisinde bululnan değerler sabittir
        */

        String name = "patika.dev";

        System.out.println(name); // output: patika.dev

        name.replace('p','P');

        System.out.println(name); // output: patika.dev , değişmedi

        System.out.println(name.replace('p','P')); // output: Patika.dev

        String name2 = name.replace('p','P');

        System.out.println(name2); // output: Patika.dev

        /* replace methodunu yeni bir string'e tanımlayarak değişikliği kaydetmiş olduk
        fakat bu ilk 'name' string'imizi değiştirmeyecektir
        */

        // StringBuilder ile oluşturulan stringler, değişkendir, mutable'dır.

        StringBuilder alphabet = new StringBuilder();

        for (char current = 'a'; current <= 'z' ; current++) {

            alphabet.append(current);
        }

        System.out.println(alphabet);



        // Append methodu farklı kullanımları

        StringBuilder builder = new StringBuilder();

        builder.append("patika")
                .append(" .dev")
                .append(" java");

        builder.append(" eğitimi");

        System.out.println(builder);



        // String Pool mekanizması

        /* Bring string tanımlandığı zaman Java bunu memorydeki bir poola atama yapıyor
        Ve aynı değer tekrar tekrar tanımlasak bile bu pool'a duplicate giriş yapmıyor
        */

        String hello = "hello patika";
        String hello2 = "hello patika"; // hello2 sadece bir pointer, linuxteki symlink gibi

        System.out.println(hello.equals(hello2)); // değerleri eşit mi ?

        System.out.println(hello == hello2); // JVM memory'deki poolda yerleri eşit mi ?

        // Farklı kullanım örnekleri



        String s = "Hello World";
        String s1 = " Hello World";

        System.out.println(s == s1);

        // output: false, çünkü boşluktan dolayı aslen farklı stringler

        String s1e = " Hello World".trim();

        System.out.println(s == s1e);

        // output: false, çünkü trim yapsak dahi farklı bir obje oluşturuldu (çünkü stringler immutable)





        String singleString = "hello world";
        String concat = "hello";
        concat += " world";

        System.out.println(singleString.equals(concat)); // output: true, değerleri eşit
        System.out.println(singleString == concat); // output: false, fakat poolda objeleri farklı



        // JVM'i string pool'da aynı objeyi kullanmaya zorlamaya çalışalım

        String hello3 = "Hello World";
        String hello4 = new String("Hello World").intern();

        System.out.println(hello3 == hello4);
        // output: true ,intern methodu ile poolda aynı objeyi force'ladık



    }
}
