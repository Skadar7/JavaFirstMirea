package ru.mirea.task2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape("круг");
        shape.setType("квадрат");
        System.out.println("Тип фигуры: " + shape.getType());
    }
}
