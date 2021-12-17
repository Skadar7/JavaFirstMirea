package ru.mirea.task28;

class Car {
    String model;
    int price;
    int year;
    Type type;

    public Car(Type type, String model, int year, int price) {
        this.type = type;
        this.price = price;
        this.year = year;
        this.model = model;
    }

    public void data() { System.out.println("Car: " + model + " " + type.type + " " + type.speed + " " + year + " " + price); }

    private static class Type {
        String type;
        int speed;

        public Type(String type, int speed) {
            this.speed = speed;
            this.type = type;
        }
    }

    public static void main(String[] args) {
        Car mers = new Car(new Type("Седан", 200), "Мерседес", 2020, 5);
        mers.data();

        Car mercedes = new Car(new Type("Специальный", 100), "Трактор", 2017, 4000) {
            @Override
            public void data() { System.out.println("Car: " + model + " " + type.type + " " + type.speed + " " + year + " " + price); }
        };

        System.out.println();
        mercedes.data();
    }
}
