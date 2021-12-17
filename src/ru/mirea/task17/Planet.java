package ru.mirea.task17;

public enum Planet {
    Mercury(100, 133),
    Venus(200, 144),
    Earth(300, 255),
    Mars(400, 266),
    Jupiter(500, 377),
    Saturn(600, 388),
    Uranus(700, 499),
    Neptune(800, 500);

    double G = 6.67408;
    double P;
    private double massKg;
    private double radiusKm;

    Planet(double massKg, double radiusKm) {
        this.massKg = massKg;
        this.radiusKm = radiusKm;

        this.P = (G * massKg) / (radiusKm * radiusKm) / 1000000;
    }

    public double getP() {
        return P;
    }
}
