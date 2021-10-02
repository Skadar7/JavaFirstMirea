package ru.mirea.task5.dish;

class Cup extends Dish {
    String color;
    int height;
    int diameter;

    Cup(int heightInCm, int diameterInCm) {
        setHeight(heightInCm);
        setDiameter(diameterInCm);
    }

    Cup(int heightInCm, int diameterInCm, String color) {
        setHeight(heightInCm);
        setDiameter(diameterInCm);
        setColor(color);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setHeight(int heightInCm) {
        this.height = heightInCm;
    }
    public int getHeight() {
        return height;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public int getDiameter() {
        return diameter;
    }


    @Override
    public String toString() {
        return "Cup {" +
                "material: " + material + "; " +
                "weight: " + weight + " gr; " +
                "color: " + color + "; " +
                "height: " + height + " cm; " +
                "diameter: " + diameter + " cm; " +
                '}';
    }
}
