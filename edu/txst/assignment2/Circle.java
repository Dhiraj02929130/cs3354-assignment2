package edu.txst.assignment2;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getClassName() {
        return "Circle";
    }

    public String toString() {
        return "Circle (radius=" + radius + ")";
    }
}
