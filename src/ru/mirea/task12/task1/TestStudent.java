package ru.mirea.task12.task1;
import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        Student[] arr = new Student[10];
        String[] nm = new String[] {"Denis", "Sergey", "Alexandr", "Vika"};
        Random rnd = new Random();
        for(int i = 0; i < 10; i++) {
            int age = rnd.nextInt((30 - 18) + 1) + 18;
            int crs = rnd.nextInt((6 - 1) + 1) + 1;

            arr[i] = (new Student(nm[i % 4], age, crs, i*crs));
        }

        System.out.println("BEFORE SORT\n------------------------------");
        for(int i = 0, j = arr.length; i < j; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("AFTER SORT\n-------------------------------");
        sortStudent(arr);
        for(int i = 0, j = arr.length; i < j; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sortStudent(Student[] arrStud) {
        for (int i = 0, j = arrStud.length - 1; i < j; i++) {
            int value = arrStud[i].getID();
            int k = i - 1;
            for (; k >= 0; k--) {
                if (value < arrStud[k].getID()) {
                    arrStud[k + 1] = arrStud[k];
                } else {
                    break;
                }
            }
        }
    }
}
