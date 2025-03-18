package Practices.GameChar;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 1500, 250);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(name + " kılıcıyla saldırıyor! Hasar: " + attackPower);
    }

    public void shieldBlock(){
        System.out.println(name + " kalkanını kullanarak savunma yapıyor!");
    }

}
