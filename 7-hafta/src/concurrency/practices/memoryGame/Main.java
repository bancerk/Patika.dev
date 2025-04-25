package concurrency.practices.memoryGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Memory Game'e Hoş Geldin!");
        System.out.println("Oyuncu adınızı girin: ");
        String nickName = scanner.nextLine();

        MemoryGame memoryGame = new MemoryGame(new Player(nickName));
        memoryGame.showMenu();
    }
}
