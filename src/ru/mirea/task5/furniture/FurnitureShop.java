package ru.mirea.task5.furniture;

import java.util.Vector;

class FurnitureShop {
    Vector<Table> tables = new Vector<>();
    Vector<Wardrobe> wardrobes = new Vector<>();

    public void addTable(Table table) {
        tables.add(table);
    }
    public void addWardrobe(Wardrobe wr) {
        wardrobes.add(wr);
    }

    public int getTablesNum() {
        return tables.size();
    }
    public int getWardrobesNum() {
        return wardrobes.size();
    }

    Wardrobe sellwardrobes(int height, int width, int depth, String material) {
        for(Wardrobe wrd: wardrobes) {
            if (wrd.getHeight() == height && wrd.getWidth() == width && wrd.getDepth() == depth
                    && wrd.getMaterial().equals(material)){
                wardrobes.remove(wrd);
                return wrd;
            }
        }
        return new Wardrobe();
    }

    Table sellTable(int height, int legsNum, int diam, String material) {
        for(Table tbl: tables) {
            if (tbl.getHeight() == height && tbl.getLegsNum() == legsNum && tbl.getTabletopDiameter() == diam
                    && tbl.getMaterial().equals(material)){
                tables.remove(tbl);
                return tbl;
            }
        }
        return new Table();
    }
}
