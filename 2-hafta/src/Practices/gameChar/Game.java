package Practices.gameChar;

public class Game {

    /*
    Savaşçı
    Büyücü
    Okçu
    */

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Thor");
        Mage mage = new Mage("Gandalf");
        Archer archer = new Archer("Legolas");

        warrior.showStats();
        mage.showStats();
        archer.showStats();

        // Karakterler saldırı yapıyor
        System.out.println("=== Saldırılar başlıyor ===");
        warrior.attack();
        mage.attack();
        archer.attack();

        //
        System.out.println("=== Özel yetenekler ===");
        warrior.shieldBlock();
        mage.castSpell();
        archer.multiShot();

    }

}
