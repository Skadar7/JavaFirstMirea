package ru.mirea.task3;

public class BookTest {
    public static void main(String[] arr) {
        Book f = new Book("Petrov L.C", "Room", 1975);
        Book s = new Book("Kuznetsov D.R", "Home", 2011);

        System.out.println("Первая книга");
        System.out.println("Автор: " + f.getAuthor() + " Название: " + f.getName() +
                " Год издания: " + f.getYear());

        System.out.println("Вторая книга");
        System.out.println("Автор: " + s.getAuthor() + " Название: " + s.getName() +
                " Год издания: " + s.getYear());

        f.setYear(1977);
        System.out.println("Изменен год издания первой книги на " + f.getYear());

        s.setName("Job");
        System.out.println("Изменено название второй книги на " + s.getName());

        System.out.println(f);
    }
}
