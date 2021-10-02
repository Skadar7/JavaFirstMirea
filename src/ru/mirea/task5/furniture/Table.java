package ru.mirea.task5.furniture;

class Table extends Furniture {
    int legsNum;
    int tabletopDiameter;

    Table(String material, int height, int legsNum, int tabletopDiameter) {
        this.setMaterial(material);
        this.setHeight(height);
        this.setLegsNum(legsNum);
        this.setTabletopDiameter(tabletopDiameter);
    }

    Table() {
        this.setMaterial("");
        this.setHeight(0);
        this.setLegsNum(0);
        this.setTabletopDiameter(0);
    }

    public void setLegsNum(int legsNum) {
        this.legsNum = legsNum;
    }
    public int getLegsNum() {
        return legsNum;
    }

    public void setTabletopDiameter(int tabletopDiameter) {
        this.tabletopDiameter = tabletopDiameter;
    }
    public int getTabletopDiameter() {
        return tabletopDiameter;
    }

    @Override
    public String toString() {
        return "Table{" +
                "material: " + material + "; " +
                "height: " + height + "; " +
                "number of legs: " + legsNum + "; " +
                "tabletop diameter: " + tabletopDiameter +
                '}';
    }
}
