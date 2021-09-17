package ru.mirea.task7.shape;

public class Circle extends Shape {

    protected double radius;

    Circle() {
        this.filled = false;
        this.color = "BLUE";
        this.radius = 1.0;
    }
    Circle(double radius) {
        this.filled = false;
        this.color = "BLUE";
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color+", filled: " + this.filled;
    }
}
