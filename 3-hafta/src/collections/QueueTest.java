package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<String> breadQeueue = new PriorityQueue<>();

        breadQeueue.add("Cem");
        breadQeueue.add("Emir");
        breadQeueue.add("Ahmet");
        breadQeueue.add("Ayşe");

        System.out.println("Ekmek kuyruğu: " + breadQeueue);

        // eklediğimiz sırada gelmedi

        // ekmek kuyruğumuzda mantıken FIFO çıkışı olmalı

        breadQeueue.remove(); //en son eklenen elemanı çıkardı
        System.out.println(breadQeueue);

    }
}
