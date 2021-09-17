package ru.mirea.task7.shape;

public class TestShape {
    public static void main(String[] arg) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimetr()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled() + "\n");
        //System.out.println(s1.getRadius()); //Ошибка из за отсутстви данного метода у экземпляра класса

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimetr());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius() + "\n");

        //Shape s2 = new Shape(); //Нельяз создать экземпляр абсрактного класса

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimetr());
        System.out.println(s3.getColor() + "\n");
        //System.out.println(s3.getLength()); //Ошибка из за отсутстви данного метода у экземпляра класса

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength() + "\n");

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor() + "\n");
        //System.out.println(s4.getSide()); //Ошибка из за отсутстви данного метода у экземпляра класса

        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); //Ошибка из за отсутстви данного метода у экземпляра класса
        System.out.println(r2.getLength() + "\n");

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength() + "\n");
    }
}
