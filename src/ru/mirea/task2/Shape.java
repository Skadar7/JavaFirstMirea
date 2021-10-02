package ru.mirea.task2;

public class Shape {
    private String type;

    public Shape(String type){ this.type=type; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                '}';
    }
}
