package ru.mirea.task8.shape;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


class CreateTwentyFigure extends JFrame {
    public CreateTwentyFigure() {
        super("Create20Figure");
        setSize(1080, 720);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D fig = (Graphics2D) g;
        Random rnd = new Random();

        final int maxX = 900;
        final int maxY = 600;

        for(int i = 0; i < 20; i++) {
            int f = rnd.nextInt(3);
            switch(f) {
                case 0:
                    Circle c = new Circle(rnd.nextInt((maxX-100) + 1) + 100,
                            rnd.nextInt((maxY-100) + 1) + 100, rnd.nextInt(255),
                            rnd.nextInt(255), rnd.nextInt(255));
                    c.printFigure(fig);
                    break;
                case 1:
                    Rectangle r = new Rectangle(rnd.nextInt((maxX-100) + 1) + 100,
                            rnd.nextInt((maxY-100) + 1) + 100, rnd.nextInt(255),
                            rnd.nextInt(255), rnd.nextInt(255));
                    r.printFigure(fig);
                    break;
                case 2:
                    Triangle t = new Triangle(rnd.nextInt((maxX-100) + 1) + 100,
                            rnd.nextInt((maxY-100) + 1) + 100, rnd.nextInt(255),
                            rnd.nextInt(255), rnd.nextInt(255));
                    t.printFigure(fig);
                    break;
            }

        }
    }

    public static void main(String[] args) {
        CreateTwentyFigure app = new CreateTwentyFigure();
    }
}