package ru.mirea.task12.task23;

import java.util.ArrayList;

public class SortingStudentsByGPA {
    public static class Students implements Comparable<Students> {
        private String FIO;
        private ArrayList<Integer> grades = new ArrayList<>();

        public Students(String FIO, ArrayList<Integer> sGrades) {
            setFIO(FIO);
            setGrades(sGrades);
        }

        public void getGrades() {
            System.out.println(grades);
        }

        public void setGrades(ArrayList<Integer> sGrades) {
            this.grades.addAll(sGrades);
        }

        public void setFIO(String FIO) {
            this.FIO = FIO;
        }

        public String getFIO() {
            return FIO;
        }

        public double getGPA() {
            int size = grades.size();
            int cnt = 0;
            for(int g: grades) {
                cnt += g;
            }

            return cnt/size + cnt % size*0.1;
        }

        @Override
        public int compareTo(Students student) {
            if (this.getGPA() < student.getGPA()) {
                return -1;
            }
            else if (student.getGPA() < this.getGPA()) {
                return 1;
            }
            return 0;
        }

        @Override
        public String toString() {
            return "{" +
                    "FIO='" + FIO + '\'' +
                    ", grades='" + grades + '\'' +
                    ", GPA='" + getGPA() + '\'' +
                    '}';
        }
    }
}

