package dateAndMathApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateApiFormattingMain {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;

        System.out.println(today.format(dateTimeFormatter));

        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        String stringDate = "25/01/2026";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate = LocalDate.parse(stringDate,formatter);

        System.out.println("İleri tarihi: " + localDate);

        System.out.println("İleri tarihi: " + LocalDate.parse("2025-03-23"));

        // System.out.println("İleri tarihi: " + LocalDate.parse("23/03/2027"));

        // parse için ya kendi formatını vermelisin ya da default kullandığı iso date kullanmalısın

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        System.out.println(now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));

        String stringDateTime = "25-01-2026 16:05:55";

        System.out.println(LocalDateTime.parse(stringDateTime, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        LocalDateTime localDateTimeAustralia = ZonedDateTime.now(ZoneId.of("Australia/Sydney")).toLocalDateTime();

        System.out.println("Australia: " + localDateTimeAustralia);


    }
}
