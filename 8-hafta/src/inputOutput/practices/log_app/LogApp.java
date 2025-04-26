package inputOutput.practices.log_app;

import inputOutput.practices.log_app.enums.LogLevel;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class LogApp {

    private static Set<String> USER_NAMES = new HashSet<>();

    private static File LOG_FILE = new File("/home/canberk/IdeaProjects/Patika.dev/8-hafta/src/inputOutput/practices/log_app/log.txt");


    public static void main(String[] args) {


        USER_NAMES.add("elif");
        USER_NAMES.add("cem");
        USER_NAMES.add("patika");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı girin: ");
        String userName = scanner.nextLine();

        Optional<String> optionalUserName = USER_NAMES.stream()
                .filter(name -> name.equalsIgnoreCase(userName))
                .findFirst();

        if (optionalUserName.isEmpty()) {
            // todo log atılacak
            writeLog(LogLevel.ERROR, "Kullanıcı bulunamadı: " + userName);
            System.out.println("Kullanıcı bulunamadı: " + userName);
        } else {
            writeLog(LogLevel.INFO, "Kullanıcı giriş yaptı.");
        }

        int choice;

        do {
            System.out.println("\n---LOG UYGULAMASI---");
            System.out.println("1. Loglarda ara");
            System.out.println("2. Log dosyasını temizle");
            System.out.println("3. Çıkış");

            System.out.println("Seçiminiz: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    searchLog(scanner);
                    break;
                case 2:
                    clearLogFile(scanner);
                    break;
                case 3:
                    writeLog(LogLevel.INFO, "Uygulama sonlandırıldı.");
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz işlem!");
            }

        } while (choice != 3);
        scanner.close();
    }

    private static void clearLogFile(Scanner scanner) {
        System.out.println("Logları silmek istiyor musunuz ? (E / H)");
        String choice = scanner.nextLine().toLowerCase();
        if ("e".equalsIgnoreCase(choice)){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE))){

                writer.write("");
                System.out.println("Log dosyası temizlendi.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else System.out.println("İşlem iptal edildi.");
    }

    private static void searchLog(Scanner scanner) {
        System.out.println("Aranacak kelime: ");
        String searchKey = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))) {

            String line;
            boolean isFound = false;

            while ((line = reader.readLine()) != null) {
                if (line.toUpperCase().contains(searchKey.toUpperCase())) {
                    System.out.println("Bulunan log -> " + line);
                    isFound = true;
                }
            }

            if (!isFound) {
                System.out.println("Aradığınız kelime loglarda bulunamadı");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeLog(LogLevel logLevel, String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) {

            String formattedDate = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

            String log = String.format("[%s] [%s] [%s]", formattedDate, logLevel, message);
            writer.write(log);
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Log yazılamadı: " + e.getMessage());
        }
    }
}
