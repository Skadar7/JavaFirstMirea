package ru.mirea.task2;

class TestBall {
    public static void main(String[] args) {
        Ball firstBall = new Ball();
        Ball secondBall = new Ball("red", 10.0, 20.0);

        firstBall.setColor("blue");
        firstBall.setCost(200.0);
        firstBall.setDiameter(30.0);

        System.out.println(firstBall);
        System.out.println(secondBall);
    }
}
