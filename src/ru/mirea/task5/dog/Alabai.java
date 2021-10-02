package ru.mirea.task5.dog;

class Alabai extends Dog {
    Alabai() {
        setSize("BIG");
        setEars("lying long ears");
        setCoat("short");
    }

    @Override
    public void bark() {
        System.out.println("BARK ARRR!!!");
    }

    @Override
    public String toString() {
        return ("Alabai {" +
                "size: " + size + "; " +
                "ears: " + ears + "; " +
                "coat: " + coat +
                '}');
    }
}
