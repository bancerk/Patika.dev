package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        Set <String> fruits = new HashSet<>();
        fruits.add("Apple"); // Hash set, girilen her eleman için unique bir hash değeri oluşturur
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Hash setler matematikteki küme gibi davranırlar, aynı eleman 2 defa eklenemez
        fruits.add(null); // null olmasına rağmen hash ile tutulduğu için hashset içinde yer tutar

        System.out.println("Apple kelimesinin hashCode karşılşığı: " + "Apple".hashCode());
        System.out.println("Null kelimesinin hashCode karşılşığı: " + "null".hashCode()); // Hashset'imiz String seti olduğu için null değerini String olarak alıyor

        System.out.println("Fruits: " + fruits);



        //LinkedHashSet

        LinkedHashSet<String> cities = new LinkedHashSet();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");
        cities.add("İstanbul");

        System.out.println("Cities LinkedHashSet: " + cities);

        //TreeSet

        //En önemli özelliği sıralama yapabilmesi

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        System.out.println("Numbers TreeSet :" + numbers);

        Set<String> cars = new TreeSet<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");

        System.out.println("Cars TreeSet :" + cars);

        cars.remove("Audi");

        System.out.println("Cars TreeSet :" + cars);

        System.out.println("Size : " + cars.size());

        cars.clear();

        System.out.println("Cars TreeSet clear:" + cars);

        System.out.println("Cars isEmpty ?: " + cars.isEmpty());

    }
}
