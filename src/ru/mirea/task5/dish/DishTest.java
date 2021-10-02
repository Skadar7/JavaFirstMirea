package ru.mirea.task5.dish;

class DishTest {
    public static void main(String[] args) {
        Cup cp1 = new Cup(10, 5);
        cp1.setMaterial("glass");
        cp1.setWeight(100);
        cp1.setColor("white");

        System.out.println(cp1);

        Spoon sp1 = new Spoon(15, 5);
        sp1.setMaterial("Stainless steel");
        sp1.setWeight(90);

        System.out.println(sp1);
    }
}
