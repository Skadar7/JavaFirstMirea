package ru.mirea.task7;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft ;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return "MovableRectangle topLeft: " + topLeft + " bottomRight " + bottomRight;
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveRight() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveLeft() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
}
