package ru.mirea.task2;

public class Ball {
    private String color;
    private Double diameter;
    private Double cost;

    public Ball() {}

    public Ball(String color, Double diameter, Double cost) {
        setColor(color);
        setCost(cost);
        setDiameter(diameter);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Double getCost() {
        return cost;
    }
    public Double getDiameter() {
        return diameter;
    }
    public String getColor() {
        return color;
    }

    public String toString() {
        return this.color + ", " + diameter.toString() + ", "
                + cost.toString();
    }
}
