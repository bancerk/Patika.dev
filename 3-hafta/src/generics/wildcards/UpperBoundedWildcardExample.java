package generics.wildcards;

import java.util.List;

public class UpperBoundedWildcardExample {

    public static double sum(List<? extends Number>list){
        double sum =0;
        for (Number number : list){
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,3,4);

        List<Double> doubleList = List.of(1.5,2.5);

        System.out.println(sum(integerList));
        System.out.println(sum(doubleList));

        List<String> stringList = List.of("Patika");
        // sum(stringList); sum Number'dan extend olduğu için string alamıyor ve hata veriyor

    }
}
