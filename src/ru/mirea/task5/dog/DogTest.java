package ru.mirea.task5.dog;

class DogTest {
    public static void main(String[] args) {
        Doberman d = new Doberman();
        System.out.println(d);
        d.bark();

        Alabai alab = new Alabai();
        System.out.println(alab);
        alab.bark();
    }
}
