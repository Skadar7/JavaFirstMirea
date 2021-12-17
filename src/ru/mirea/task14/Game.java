package ru.mirea.task14;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        withQueue();
        withDequeue();
        withList();
        withStack();
        samDeal();
    }

    public static Queue<String> deal(String check) {
        Random rnd = new Random();
        Queue<String> res = new LinkedList<>();
        int cnt = 0;
        while (cnt != 5) {
            String elem = Integer.toString(rnd.nextInt(10));
            if(check.indexOf(elem) == -1) {
                res.add(elem);
                check += elem;
                cnt++;
            }
        }
        return res;
    }

    public static void withQueue() {
        Queue<String> first = deal("");
        String temp = "";
        for(int i = 0; i < 5; i++) {
            temp += first.remove();
            first.add(temp.substring(i));
        }
        Queue<String> second = deal(temp);
        /*Queue<String> first = new LinkedList<>();
        first.add("1");
        first.add("2");
        first.add("3");
        first.add("4");
        first.add("9");
        Queue<String> second = new LinkedList<>();
        second.add("5");
        second.add("6");
        second.add("7");
        second.add("8");
        second.add("0");*/
        System.out.println(first);
        System.out.println(second);

        for (int i = 0; i < 106; i++) {
            String tmp = "";

            if (first.size() == 0) {
                System.out.println("second win "+ (i));
                return;
            }
            if (second.size() == 0) {
                System.out.println("first win " + (i));
                return;
            }
            if (first.peek().equals("0") && second.peek().equals("9")) {
                tmp = first.remove();
                first.add(tmp);
                tmp = second.remove();
                first.add(tmp);
                continue;
            }

            if (first.peek().equals("9") && second.peek().equals("0")) {
                tmp = first.remove();
                second.add(tmp);
                tmp = second.remove();
                second.add(tmp);
                continue;
            }

            if (first.peek().compareTo(second.peek()) > 0) {
                tmp = first.remove();
                first.add(tmp);
                tmp = second.remove();
                first.add(tmp);
                continue;
            }
            else {
                tmp = first.remove();
                second.add(tmp);
                tmp = second.remove();
                second.add(tmp);
                continue;
            }
        }
        System.out.println("BOTVA");
    }

    public static void withDequeue() {
        Deque<String> first = dealD("");
        String temp = "";
        for(int i = 0; i < 5; i++) {
            temp += first.remove();
            first.add(temp.substring(i));
        }
        Deque<String> second = dealD(temp);
        /*Deque<String> first = new LinkedList<>();
        first.add("1");
        first.add("2");
        first.add("3");
        first.add("4");
        first.add("9");
        Deque<String> second = new LinkedList<>();
        second.add("5");
        second.add("6");
        second.add("7");
        second.add("8");
        second.add("0");*/
        System.out.println(first);
        System.out.println(second);

        for (int i = 0; i < 106; i++) {
            String tmp = "";

            if (first.size() == 0) {
                System.out.println("second win "+ (i));
                return;
            }
            if (second.size() == 0) {
                System.out.println("first win " + (i));
                return;
            }
            if (first.peek().equals("0") && second.peek().equals("9")) {
                tmp = first.remove();
                first.add(tmp);
                tmp = second.remove();
                first.add(tmp);
                continue;
            }

            if (first.peek().equals("9") && second.peek().equals("0")) {
                tmp = first.remove();
                second.add(tmp);
                tmp = second.remove();
                second.add(tmp);
                continue;
            }

            if (first.peek().compareTo(second.peek()) > 0) {
                tmp = first.remove();
                first.add(tmp);
                tmp = second.remove();
                first.add(tmp);
                continue;
            }
            else {
                tmp = first.remove();
                second.add(tmp);
                tmp = second.remove();
                second.add(tmp);
                continue;
            }
        }
        System.out.println("BOTVA");
    }

    public static Deque<String> dealD(String check) {
        Random rnd = new Random();
        Deque<String> res = new LinkedList<>();
        int cnt = 0;
        while (cnt != 5) {
            String elem = Integer.toString(rnd.nextInt(10));
            if(check.indexOf(elem) == -1) {
                res.add(elem);
                check += elem;
                cnt++;
            }
        }
        return res;
    }

    public static void withList() {
        List<Integer> first = dealL("");
        String temp = "";
        for(int i = 0; i < 5; i++) {
            temp += first.get(i);
        }
        List<Integer> second = dealL(temp);

        /*List<Integer> first = new LinkedList<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        first.add(9);
        List<Integer> second = new LinkedList<>();
        second.add(5);
        second.add(6);
        second.add(7);
        second.add(8);
        second.add(0);*/

        System.out.println(first);
        System.out.println(second);

        for (int i = 0; i < 106; i++) {
            Integer tmp = 0;

            if (first.size() == 0) {
                System.out.println("second win "+ (i));
                return;
            }
            if (second.size() == 0) {
                System.out.println("first win " + (i));
                return;
            }
            if (first.get(0) == 0 && second.get(0) == 9) {
                tmp = first.remove(0);
                first.add(tmp);
                tmp = second.remove(0);
                first.add(tmp);
                continue;
            }

            if (first.get(0) == 9 && second.get(0) == 0) {
                tmp = first.remove(0);
                second.add(tmp);
                tmp = second.remove(0);
                second.add(tmp);
                continue;
            }

            if (first.get(0) > second.get(0)) {
                tmp = first.remove(0);
                first.add(tmp);
                tmp = second.remove(0);
                first.add(tmp);
                continue;
            }
            else {
                tmp = first.remove(0);
                second.add(tmp);
                tmp = second.remove(0);
                second.add(tmp);
                continue;
            }
        }
        System.out.println("BOTVA");
    }

    public static List<Integer> dealL(String check) {
        Random rnd = new Random();
        List<Integer> res = new LinkedList<>();
        int cnt = 0;
        while (cnt != 5) {
            Integer n = rnd.nextInt(10);
            String elem = Integer.toString(n);
            if(check.indexOf(elem) == -1) {
                res.add(n);
                check += elem;
                cnt++;
            }
        }
        return res;
    }

    public static void withStack() {
        Stack<Integer> first = dealS("");
        String temp = "";
        for(int i = 0; i < 5; i++) {
            temp += first.get(0);
        }
        Stack<Integer> second = dealS(temp);
        /*Stack<Integer> first = new Stack<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        first.add(9);
        Stack<Integer> second = new Stack<>();
        second.add(5);
        second.add(6);
        second.add(7);
        second.add(8);
        second.add(0);*/

        System.out.println(first);
        System.out.println(second);


        for (int i = 0; i < 106; i++) {
            Integer tmp;

            if (first.size() == 0) {
                System.out.println("second win "+ (i));
                return;
            }
            if (second.size() == 0) {
                System.out.println("first win " + (i));
                return;
            }
            if (first.get(0) == 0 && second.get(0) == 9) {
                tmp = first.remove(0);
                first.add(first.size(), tmp);
                tmp = second.remove(0);
                first.add(first.size(), tmp);
                continue;
            }

            if (first.get(0) == 9 && second.get(0) == 0) {
                tmp = first.remove(0);
                second.add(second.size(), tmp);
                tmp = second.remove(0);
                second.add(second.size(), tmp);
                continue;
            }

            if (first.get(0) > second.get(0)) {
                tmp = first.remove(0);
                first.add(first.size(), tmp);
                tmp = second.remove(0);
                first.add(first.size(), tmp);
                continue;
            }
            else {
                tmp = first.remove(0);
                second.add(second.size(), tmp);
                tmp = second.remove(0);
                second.add(second.size(), tmp);
                continue;
            }
        }
        System.out.println("BOTVA");
    }

    public static Stack<Integer> dealS(String check) {
        Random rnd = new Random();
        Stack<Integer> res = new Stack<>();
        int cnt = 0;
        while (cnt != 5) {
            Integer n = rnd.nextInt(10);
            String elem = Integer.toString(n);
            if(check.indexOf(elem) == -1) {
                res.add(0, n);
                check += elem;
                cnt++;
            }
        }
        return res;
    }

    public static void samDeal() {
        Deque<Integer> first = new LinkedList<>();
        Deque<Integer> second = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String check = "";

        System.out.print("Задайте колоду первому игроку: ");
        while (cnt != 10) {
            if (sc.hasNextInt()) {
                if (cnt == 4) {
                    System.out.print("Задайте колоду второму игроку: ");
                }
                int n = sc.nextInt();
                if(check.indexOf(Integer.toString(n)) == -1) {
                    if (cnt < 5) {
                        first.add(n);
                    }
                    else {
                        second.add(n);
                    }
                    cnt++;
                    check += Integer.toString(n);
                }
                else {
                    System.out.println("Нужно вводить неповторяющиеся карты");
                }
            }
            else {
                System.out.print("Введите число!");
            }
        }

        for (int i = 0; i < 106; i++) {
            Integer tmp;

            if (first.size() == 0) {
                System.out.println("second win "+ (i));
                return;
            }
            if (second.size() == 0) {
                System.out.println("first win " + (i));
                return;
            }
            if (first.peek() == 0 && second.peek() == 9) {
                tmp = first.remove();
                first.add(tmp);
                tmp = second.remove();
                first.add(tmp);
                continue;
            }

            if (first.peek() == 9 && second.peek() == 0) {
                tmp = first.remove();
                second.add(tmp);
                tmp = second.remove();
                second.add(tmp);
                continue;
            }

            if (first.peek() > second.peek()) {
                tmp = first.remove();
                first.add(tmp);
                tmp = second.remove();
                first.add(tmp);
                continue;
            }
            else {
                tmp = first.remove();
                second.add(tmp);
                tmp = second.remove();
                second.add(tmp);
                continue;
            }
        }
        System.out.println("BOTVA");
    }
}
