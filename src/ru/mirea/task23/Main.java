package ru.mirea.task23;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr_1 = new ArrayList<>();
        ArrayList<Integer> arr_2 = new ArrayList<>();

        String str_1 = "Denis";
        String str_2 = "Kuznetsov";
        String str_3 = "Romanovich";
        String str_4 = "RTU MIREA";

        System.out.print(str_1.hashCode() + " " + str_2.hashCode() + " : ");
        System.out.println(str_1.hashCode() == str_2.hashCode());


        System.out.print(str_2.hashCode() + " " + str_3.hashCode() + " : ");
        System.out.println(str_2.hashCode() == str_3.hashCode());

        System.out.print(str_3.hashCode() + " " + str_4.hashCode() + " : ");
        System.out.println(str_3.hashCode() == str_4.hashCode());

        System.out.print(str_4.hashCode() + " " + str_4.hashCode() + " : ");
        System.out.println(str_4.hashCode() == str_4.hashCode());
    }
}
