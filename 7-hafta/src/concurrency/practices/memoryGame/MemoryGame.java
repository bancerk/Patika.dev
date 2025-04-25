package concurrency.practices.memoryGame;

import java.util.*;
import java.util.stream.Stream;

public class MemoryGame {

    private final Scanner scanner = new Scanner(System.in);
    private final Player player;
    private final List<Level> levels;
    private final Set<Player> players = new HashSet<>();

    public MemoryGame(Player player) {
        this.player = player;
        this.levels = List.of(
                new Level("Kolay", 3, 1500),
                new Level("Orta", 5, 1000),
                new Level("Zor", 7, 700)
        );
    }

    public void showMenu() {
        while (true) {
            System.out.println("Oyun Menüsü");
            System.out.println(" 1 - Oyunu Başlat");
            System.out.println(" 2 - Liderlik Tablosu");
            System.out.println(" 3 - Çıkış");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    playGame();
                    break;
                case "2":
                    showLeaderboard();
                    break;
                case "3":
                    System.out.println("Görüşmek üzere " + player.getNickName());
                    return;
                default:
                    System.out.println("Geçersiz İşlem");
            }
        }
    }

    private void playGame() {

        System.out.println("Zorluk seviyesi seç: ");
        for (int i = 0; i < levels.size(); i++) {
            System.out.println((i + 1) + " - " + levels.get(i).getName());
        }
        System.out.print("Seçimiz: ");
        int levelIndex;

        levelIndex = Integer.parseInt(scanner.nextLine()) - 1;

        Level level = levels.get(levelIndex);

        Random random = new Random();

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < level.getNumberCount(); i++) {
            int randomNumber = random.nextInt(90) + 10;
            numbers.add(randomNumber);
        }

        System.out.println("Sayılar gösteriliyor. Hazır Ol!");

        try {
            sleep();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread showNumbersTask = new Thread(new NumberDisplayTask(numbers, level.getDisplayTime()));
        showNumbersTask.start();

        try {
            showNumbersTask.join(); // gösterim işleminin bitmesini bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hangi sayıları gördün ?(Boşlukla ayırarak yaz)");

        System.out.println("Tahmin: ");
        String[] inputs = scanner.nextLine().split(" ");

        int correctCounter = 0;

        for (String input : inputs) {
            int guess = Integer.parseInt(input);

            if (numbers.contains(guess)) {
                correctCounter++;
                numbers.remove((Integer) guess);
            }
        }

        System.out.println("Doğru bildiğiniz sayı: " + correctCounter);
        player.addScore(correctCounter * 10);

        System.out.println("Skorun: " + player.getScore());
        players.add(player);

    }

    private void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }

    private void showLeaderboard() {
        List<String> players = this.players.stream()
                .map(Player::getNickName)
                .limit(3)
                .toList();

        System.out.println(players);
    }
}
