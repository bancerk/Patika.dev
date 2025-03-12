package ObjectOrientedProgramming.Abstract;

public abstract class BigCat extends Animal{
        // Cat classını da abstract hale getirerek implementation yapma gereğini yok ettik

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
