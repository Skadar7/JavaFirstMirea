package ru.mirea.task8.shape;

import java.awt.Graphics2D;

abstract class Shape {
    protected final int HW = 100;
    private int r;
    private int g;
    private int b;
    private int x;
    private int y;

    Shape(int x, int y, int r, int g, int b) {
        setX(x);
        setY(y);
        setR(r);
        setG(g);
        setB(b);
    }

    public abstract void printFigure(Graphics2D fig);

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }
}
