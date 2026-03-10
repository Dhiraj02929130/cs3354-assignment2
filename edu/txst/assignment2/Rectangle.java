package edu.txst.assignment2;

public class Rectangle implements Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public String getClassName() {
        return "Rectangle";
    }

    public String toString() {
        return "Rectangle (width=" + width + ", length=" + length + ")";
    }
}
