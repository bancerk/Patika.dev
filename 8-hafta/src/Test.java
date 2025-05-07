import java.util.ArrayList;
import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);

            // for loop ile 1'den 1m'a kadar sayılar listeye eklendi
        }

        long start1 = System.nanoTime();
        enBuyukEleman2(list);
        long end1 = System.nanoTime();
        System.out.println("\nMethod 1 (map before reduce): " + (end1 - start1) + " ns");

        long start2 = System.nanoTime();
        enBuyukElemanSelf(list);
        long end2 = System.nanoTime();
        System.out.println("\nMethod 2 (map after reduce): " + (end2 - start2) + " ns");

        System.out.println("Map Diff: " + ((end1 - start1) - (end2 - start2)) + "ns");

        // https://chatgpt.com/share/681a505c-0a4c-8009-b9be-4156c4949685

    }

    public static void enBuyukEleman2(ArrayList<Integer> list) {
        Optional<Long> maxEleman = list.stream()
                .filter(t -> t % 2 == 0)
                .map(t -> (long)t * t)
                .reduce(Long::max);
        maxEleman.ifPresent(System.out::print);
    }

    public static void enBuyukElemanSelf(ArrayList<Integer> list) {
        Optional<Integer> maxEleman = list.stream()
                .filter(t -> t % 2 == 0)
                .reduce(Integer::max);
        Optional<Long> maxSquared = maxEleman.map(t ->(long) t * t);
        maxSquared.ifPresent(System.out::print);
    }
}