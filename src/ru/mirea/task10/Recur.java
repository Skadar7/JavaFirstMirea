package ru.mirea.task10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Recur {
    public static void main(String[] arg) {
        System.out.println(task_16(0,0)+1);
        //System.out.println(task_17());
        //task_1(8, 1);
        //task_5(12345);
        //task_13();
    }

    public static int task_16(int cnt, int max) {
        Scanner sc = new Scanner(System.in);
        int dig = sc.nextInt();
        if (dig == 0 ) {
            return cnt;
        }
        else {
            if (dig > max) {
                max = dig;
                cnt = 0;
                return task_16(cnt, max);
            }
            else if (dig == max) {
                cnt++;
                return task_16(cnt, max);
            }
            else {
                return task_16(cnt, max);
            }
        }
    }
    public static int task_17() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int m = task_17();
            if (n > m) {
                return n;
            }
            else {
                return m;
            }
        }
        else {
            return 0;
        }
    }

    public static void task_1(int n, int k) {
        for(int i = 0; i < k; i++) {
            System.out.println(k);
            --n;
            if (n == 0) {
                return;
            }
        }
        task_1(n, ++k);
    }

    public static void task_5(int N) {
        if (N <= 0) {
            return;
        }
        else {
            System.out.println(N % 10);
            task_5(N/10);
        }
    }

    public static void task_13() {
        Scanner sc = new Scanner(System.in);
        int dig = sc.nextInt();
        if(dig != 0) {
          System.out.println(dig);
          dig = sc.nextInt();
          if (dig != 0) {
              task_13();
          }
        }
    }
}
