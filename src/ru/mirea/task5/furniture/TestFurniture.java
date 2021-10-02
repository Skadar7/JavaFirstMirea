package ru.mirea.task5.furniture;

public class TestFurniture {
    public static void main(String[] args) {
        Table tb = new Table("wood", 150, 4, 100);
        Table tb1 = new Table("plastic", 160, 3, 80);

        Wardrobe wd = new Wardrobe("wood", 200, 150, 3, 80);
        Wardrobe wd1 = new Wardrobe("wood", 150, 100, 2, 70);

        System.out.println(tb);
        System.out.println(wd1);


        FurnitureShop shop = new FurnitureShop();
        shop.addWardrobe(wd);
        shop.addWardrobe(wd1);
        System.out.println(shop.wardrobes);
        shop.sellwardrobes(150, 100, 70, "wood");
        System.out.println(shop.wardrobes);
    }
}
