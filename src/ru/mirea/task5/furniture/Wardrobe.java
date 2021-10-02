package ru.mirea.task5.furniture;

class Wardrobe extends Furniture {
    int doorsNum;
    int width;
    int depth;

    Wardrobe(String material, int height, int width, int doorsNum, int depth) {
        this.setMaterial(material);
        this.setHeight(height);
        this.setWidth(width);
        this.setDoorsNum(doorsNum);
        this.setDepth(depth);
    }

    Wardrobe() {
        this.setMaterial("");
        this.setHeight(0);
        this.setWidth(0);
        this.setDoorsNum(0);
        this.setDepth(0);
    }

    public void setDoorsNum(int doorsNum) {
        this.doorsNum = doorsNum;
    }
    public int getDoorsNum() {
        return doorsNum;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    public int getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "material: " + material + "; " +
                "height: " + height + "; " +
                "number of doors: " + doorsNum + "; " +
                "width: " + width + "; " +
                "depth: " + depth +
                '}';
    }
}
