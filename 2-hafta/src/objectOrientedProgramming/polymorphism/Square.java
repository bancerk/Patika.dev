package objectOrientedProgramming.polymorphism;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}
