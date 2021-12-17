package ru.mirea.task17;

import java.util.Scanner;

public class Planets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int planetNum;

        System.out.print("Введите номер планеты: ");

        planetNum = sc.nextInt();

        if (planetNum < 8) {
            System.out.print("Сила притяжения: ");
            System.out.print(Planet.values()[planetNum].getP());
            System.out.print(" m/s^2");
        }
        else {
            System.out.println("Неверно набран номер планеты");
        }
    }
}
