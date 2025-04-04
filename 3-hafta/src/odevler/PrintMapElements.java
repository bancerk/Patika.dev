package odevler;

import java.util.HashMap;
import java.util.Map;

public class PrintMapElements {

    public static void main(String[] args) {

        // Öğrencilerin isimlerini ve notlarını tutacak bir HashMap oluşturuluyor
        Map<String, Integer> scores = new HashMap<>();

        // Map içerisine veriler ekleniyor
        scores.put("Ali", 85);
        scores.put("Ayşe", 92);
        scores.put("Mehmet", 78);
        scores.put("Zeynep", 90);
        scores.put("Burak", 88);

        // Map’in her bir elemanını (anahtar-değer çiftini) ekrana yazdırıyoruz
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            // entry.getKey() ile anahtarı (ismi), entry.getValue() ile değeri (notu) alıyoruz
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
