package ru.mirea.task5.dish;

class Spoon extends Dish {
    int length;
    int thickness;

    Spoon(int length, int thickness) {
        setLength(length);
        setThicknessInMm(thickness);
    }

    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }

    public void setThicknessInMm(int thickness) {
        this.thickness = thickness;
    }
    public int getThickness() {
        return thickness;
    }

    @Override
    public String toString() {
        return "Spoon {" +
                "material: " + material + "; " +
                "weight: " + weight + " gr; " +
                "length: " + length + " cm; " +
                "thickness: " + thickness + " mm" +
                '}';
    }
}