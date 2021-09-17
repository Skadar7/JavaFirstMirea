package ru.mirea.task7.shape;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape() {
        this.color = "BLUE";
        this.filled = false;
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimetr();
    public abstract String toString();
}
