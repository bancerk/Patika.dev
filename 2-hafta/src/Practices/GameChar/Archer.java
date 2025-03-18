package Practices.GameChar;

public class Archer extends Character {

    public Archer(String name) {
        super(name, 800, 375);
    }

    @Override
    public void attack() {
        System.out.println(name + " ok fırlatıyor! Hasar: " + attackPower);
    }

    public void multiShot(){
        System.out.println(name + " 3 ok birden fırlattı! Hasar: " + attackPower*3);
    }

}
