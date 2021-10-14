package ru.mirea.task12.task23;

import java.util.*;

public class TestSorting {
    public static void main(String[] args) {
        SortingStudentsByGPA.Students[] students1 = new SortingStudentsByGPA.Students[5];
        SortingStudentsByGPA.Students[] students2 = new SortingStudentsByGPA.Students[5];
        ArrayList<Integer> grades = new ArrayList<>();
        Random rnd = new Random();
        String[] FIO = new String[]{"Kuznetsov D.R.", "Sugrobov S.A", "Andrianov D.A.", "Petrova V.V."};
        for (int i = 0; i < 10; i++) {
            for (int j = 0, k = rnd.nextInt(10 - 3) + 3; j < k; j++) {
                grades.add(rnd.nextInt(6 - 2) + 2);
            }
            if (i < 5) {
                students1[i] = (new SortingStudentsByGPA.Students(FIO[i % 3], grades));
            } else {
                students2[i % 5] = (new SortingStudentsByGPA.Students(FIO[i % 3], grades));
            }
            grades.clear();
        }
        //first(students1);
        second(students1, students2);
    }

    public static void first(SortingStudentsByGPA.Students[] students) {

        System.out.println("BEFORE SORT\n------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(students[i]);
        }
        System.out.println("AFTER SORT\n-------------------------------");
        ArrayList<SortingStudentsByGPA.Students> students1 = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            students1.add(students[i]);
        }
        Collections.sort(students1);
        for (int i = 0; i < 5; i++) {
            System.out.println(students1.get(i));
        }
    }

    public static void second(SortingStudentsByGPA.Students[] students1,
                              SortingStudentsByGPA.Students[] students2) {
        System.out.println("BEFORE SORT\n------------------------------");
        System.out.println("First list: \n");
        for (int i = 0; i < 5; i++) {
            System.out.println(students1[i]);
        }
        System.out.println("\nSecond list: \n");
        for (int i = 0; i < 5; i++) {
            System.out.println(students2[i]);
        }
        MergeSortTest(students1, students2);
    }

    public static SortingStudentsByGPA.Students[] merge(SortingStudentsByGPA.Students[] arr1,
                                                        SortingStudentsByGPA.Students[] arr2) {
        SortingStudentsByGPA.Students[] arr = new SortingStudentsByGPA.Students[arr1.length + arr2.length];

        for(int i=0; i < arr1.length; i++) arr[i] = arr1[i];

        for(int i=0; i < arr2.length; i ++) arr[i + arr2.length]=arr2[i];

        return arr;
    }

    public static void MergeSort(SortingStudentsByGPA.Students[] students, int l, int r) {

        if (r <= l)
            return;
        int mid = l + (r - l) / 2;
        MergeSort(students, l, mid);
        MergeSort(students, mid + 1, r);

        SortingStudentsByGPA.Students[] buf = Arrays.copyOf(students, students.length);

        for (int k = l; k <= r; k++)
            buf[k] = students[k];

        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {

            if (i > mid) {
                students[k] = buf[j];
                j++;
            } else if (j > r) {
                students[k] = buf[i];
                i++;
            } else if (buf[j].getGPA() < buf[i].getGPA()) {
                students[k] = buf[j];
                j++;
            } else {
                students[k] = buf[i];
                i++;
            }
        }
    }

    public static void MergeSortTest(SortingStudentsByGPA.Students[] students1,
                                     SortingStudentsByGPA.Students[] students2) {
        SortingStudentsByGPA.Students[] arr = merge(students1, students2);

        MergeSort(arr, 0, arr.length-1);
        System.out.println("AFTER SORT\n-------------------------------");
        for (int i=0; i<arr.length; i++) System.out.println(arr[i]);
    }

}