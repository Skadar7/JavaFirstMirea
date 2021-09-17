package ru.mirea.task7.shape;

public class Square extends Rectangle {
    protected double side;

    Square() {
        this.side = 1.0;
        this.color = "BLUE";
        this.filled = false;
        this.length = 1.0;
        this.width = 1.0;
    }
    Square(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
        this.color = "BLUE";
        this.filled = false;
    }

    Square(double side, String color, boolean filled) {
        super.color = color;
        super.filled = filled;
        this.side = side;
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double getPerimetr() {
        return this.side * 4;
    }

    @Override
    public String toString() {
        return "Shape: square, side: "+this.side+", color: "+this.color+", filled: "+this.filled;
    }
}
