package odevler.methodReference;

import java.util.ArrayList;
import java.util.List;

public class convertTraditionalToMethodReference {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        // Print with method reference
        names.forEach(System.out::println);

    }
}

/*
Verilen Kod (Geleneksel Yöntemle Yazılmış)

public class Main {

public static void main(String[] args) {

List<String> names = new ArrayList<>();

names.add("Ahmet");

names.add("Ayşe");

names.add("Mehmet");

names.add("Zeynep");

// Geleneksel yöntemle liste elemanlarını yazdırma

for (String name : names) {

System.out.println(name);

}

}

}

İstenilen Çıktı:

Ahmet

Ayşe

Mehmet

Zeynep

    Yukarıdaki kodda method reference kullanarak aynı işlemi nasıl daha kısa ve okunabilir hale getirebilirsiniz?

    for döngüsünü method reference kullanarak nasıl değiştirebilirsiniz?

Method reference kullanarak kodunuzu yeniden yazın!
 */