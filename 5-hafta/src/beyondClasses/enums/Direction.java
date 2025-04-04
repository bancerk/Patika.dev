package beyondClasses.enums;

public enum Direction {

    NORTH(0,"North"),
    EAST(90,"East"),
    SOUTH(180,"South"),
    WEST(270,"West");

    private final int angle;

    private final String direction;

    Direction(int angle,String direction){
        this.angle = angle;
        this.direction = direction;
    }

    public int getAngle() {
        return angle;
    }

    public String getDirection() {
        return direction;
    }
}
