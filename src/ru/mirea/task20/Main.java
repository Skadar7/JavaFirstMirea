package ru.mirea.task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class DBuild {
    long getMlsc(String date_str) {
        long mlsc = -1;
        SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date date = a.parse(date_str);
            mlsc = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return mlsc;
    }
}

class T_Date extends DBuild {
    public Date build(String date_str) {
        Date date;
        long mlsc = getMlsc(date_str);
        date = new Date(mlsc);
        return date;
    }
}

class T_Calendar extends DBuild {
    Calendar build(String date_str) {
        Calendar calendar = Calendar.getInstance();

        try {
            SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            calendar.setTime(a.parse(date_str));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return calendar;
    }
}

class SetDate {
    String name;
    Calendar taskReceiveDate;
    Date doneTaskDate;

    public SetDate(String name, Calendar taskDate) {
        this.name = name;
        this.taskReceiveDate = taskDate;
    }

    public void handOver() { this.doneTaskDate = new Date(); }

    @Override
    public String toString() {
        return "SetDate{" +
                "name='" + name + '\'' +
                ", taskReceiveDate=" + taskReceiveDate +
                ", doneTaskDate=" + doneTaskDate +
                '}';
    }
}

public class Main {
    void task1() {
        System.out.println("Enter date: yyyy-mm-dd hh:mm");
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");;
        String dateString = scanner.next();

        T_Date t_date = new T_Date();
        Date date = t_date.build(dateString);
        System.out.println(date);
    }

    void task2() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        String lastName;
        String receiptDateStr;

        System.out.println("Enter student lastname");
        lastName = scanner.next();
        System.out.println("Enter task receipt date: yyyy-MM-dd HH:mm");
        receiptDateStr = scanner.next();

        T_Calendar t_calendar = new T_Calendar();
        Calendar receiptDate = t_calendar.build(receiptDateStr);
        SetDate main = new SetDate(lastName, receiptDate);

        main.handOver();

        System.out.println(main);
    }



    public static void main(String[] args) {
        Main t_main = new Main();
        t_main.task1();
        t_main.task2();
    }
}
