package ru.mirea.task5.dog;

class Doberman extends Dog {
    Doberman() {
        setSize("medium");
        setEars("pointed, medium");
        setCoat("short");
    }

    @Override
    public void bark() {
        System.out.println("BARK BARK");
    }

    @Override
    public String toString() {
        return ("Doberman{" +
                "size: " + size + "; " +
                "ears: " + ears + "; " +
                "coat: " + coat +
                '}');
    }
}
