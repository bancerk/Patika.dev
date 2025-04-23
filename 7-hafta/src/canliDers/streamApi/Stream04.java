package canliDers.streamApi;

import java.util.List;

public class Stream04 {
    //task 01--> Bütün üniversitelerin not ortalamalarının 74' den buyuk olup olmadığını kontrol edeniz.
    public static boolean university1(List<University>list){
        return list.stream().allMatch(u->u.getGpa()>74);
    }
    //TASK-2: Üniversitelerin her hangibirinde "math" bölümü olup olmadığını kontrol eden kod yazın
    public static boolean university2(List<University>list) {
        return list.stream().anyMatch(t -> t.getDepartment().equalsIgnoreCase("math"));
    }
    //task 03-->universite'leri ögrenci  sayilarina gore büyükten->küçüpe sıralayınız.
    // TASK-4 : Kaç tane üniversitede MAtematik bölümü olduğunu yazdırınız.
    //TASK 5 : Öğrenci sayıları 550 den fazla olan üniversitelerin lerden en yüksek not ortalamasını bulunuz

}
