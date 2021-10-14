package ru.mirea.task8.shape;

import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.awt.Color;
import java.awt.BasicStroke;

public class Triangle extends Shape{
    Triangle (int x, int y, int r, int g, int b) {
        super(x, y, r, g, b);
    }

    @Override
    public void printFigure(Graphics2D fig) {
        Path2D pth = new Path2D.Double();
        pth.moveTo(getX(), getY());
        pth.lineTo((getX() + (100 / 2)), getY() - 100);
        pth.lineTo((getX() + 100), getY());
        pth.lineTo(getX(), getY());
        pth.closePath();

        fig.setStroke(new BasicStroke(3));
        fig.setColor(new Color(getR(), getG(), getB()));
        fig.draw(pth);
        fig.fill(pth);
    }
}
