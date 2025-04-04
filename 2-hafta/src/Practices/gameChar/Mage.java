package Practices.gameChar;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 1000, 350);
    }

    @Override
    public void attack() {
        System.out.println(name + " büyü yapıyor! Hasar: " + attackPower);
    }

    public void castSpell(){
        System.out.println(name + " ateş topu büyüsü yapıyor! Hasar: " + attackPower*8);
    }

}
