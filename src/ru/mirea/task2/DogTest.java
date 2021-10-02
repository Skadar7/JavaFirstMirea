package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {
        ArrayList<Dog> array = new ArrayList<>(0);
        addDog(array);
        System.out.println(array);
    }

    public static void addDog (ArrayList<Dog> array) {
        Scanner in = new Scanner(System.in);
        do  {
            System.out.print("Введите кличку собаки и ее возраст через пробел: ");
            String name = in.next();
            int age = in.nextInt();
            array.add(new Dog(name, age));
            System.out.print("Хотите добавить собаку? (y/n): ");
        } while (!in.next().equals("n"));
    }
}