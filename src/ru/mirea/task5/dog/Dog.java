package ru.mirea.task5.dog;

abstract class Dog {
    String ears;
    String coat;
    String size;

    public void setEars(String earShape) {
        this.ears = earShape;
    }

    public String getEars() {
        return ears;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public String getCoat() {
        return coat;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    abstract public void bark();

}