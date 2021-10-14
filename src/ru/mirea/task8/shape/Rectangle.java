package ru.mirea.task8.shape;

import java.awt.Graphics2D;
import java.awt.Color;

public class Rectangle extends Shape{
    Rectangle (int x, int y, int r, int g, int b) {
        super(x, y, r, g, b);
    }

    @Override
    public void printFigure(Graphics2D fig) {
        fig.setColor(new Color(getR(), getG(), getB()));
        fig.fillRect(getX(), getY(), HW, HW);
    }
}
