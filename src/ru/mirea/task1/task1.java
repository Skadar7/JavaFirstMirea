package ru.mirea.task1;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] arr) {
        int[] t_arr = {1, 56, 71, 46, 198};
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (sc.hasNextInt()) {
            int f = sc.nextInt();
            fact(f);
        } else {
            System.out.print("Введите число!");
        }
        randarr(); //сортировка массива
        System.out.println(forBasedSum(t_arr));
        System.out.println(whileBasedSum(t_arr));
        System.out.println(doWhileBasedSum(t_arr));
        garmPrint();

        for(String str : arr) {
            System.out.println("arg: " + str);
        }
    }


    public static void fact(int f) {
        int s = 1;
        for(int i = 1; i <= f; i++) {
            s *= i;
        }
        System.out.println("Факториал числа " + f + " = " + s);
    }

    public static void randarr(){
        int[] mas = new int[10];
        Random rnd = new Random();
        for(int i = 0; i < 10; i++) {
            mas[i] = rnd.nextInt(100); // 1 метод
            //mas[i] = 0 + (int)(Math.random() * 100); // 2 метод
        }
        //System.out.println("Исходный массив");
        for(int i = 0; i < 10; i++) {
            System.out.print(mas[i] + " ");
        }
        for(int i = 0; i < 10; i++) {
            for (int j = 1 + i; j < 10; j++) {
                if (mas[j] < mas[i]) {
                    int tmp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = tmp;
                }
            }
        }
        //Arrays.sort(mas);
        System.out.println("\nОтсортированный массив");
        for(int i = 0; i < 10; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println('\n');
    }

    private static int forBasedSum(int[] arr){
        int sum = 0;
        for(int elem: arr){
            sum += elem;
        }
        return sum;
    }

    private static int whileBasedSum(int[] arr){
        int sum = 0;
        int i = 0;
        int arrLen = arr.length;
        while(i < arrLen){
            sum += arr[i];
            i++;
        }
        return sum;
    }

    private static int doWhileBasedSum(int[] arr){
        int sum = 0;
        int i = 0;
        int arrLen = arr.length;
        do{
            sum += arr[i];
            i++;
        }while(i < arrLen);
        return sum;
    }

    private static void garmPrint(){
        for(int i = 1; i <= 10; i++){
            System.out.println(1 / (float)i);
        }
    }
}
