package ru.mirea.task2;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String av, String n, int y) {
        author = av;
        name = n;
        year = y;
    }

    public Book(String n, int y) {
        author = "Unknown";
        name = n;
        year = y;
    }

    public String toString() {
        return "Автор: " + author + " Название: " + name + " Год издания: " + year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setAuthor(String av) {
        author = av;
    }

    public void setName(String n) {
        name = n;
    }

    public void setYear(int y) {
        year = y;
    }
}
