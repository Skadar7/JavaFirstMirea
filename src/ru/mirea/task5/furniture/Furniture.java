package ru.mirea.task5.furniture;

import java.util.ArrayList;
import java.util.Vector;

abstract class Furniture {
    String material;
    int height;

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
}





