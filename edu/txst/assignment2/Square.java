package edu.txst.assignment2;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String getClassName() {
        return "Square";
    }

    public String toString() {
        return "Square (side=" + side + ")";
    }
}
