package ru.mirea.task15;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestMyFile {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "E:\\text.txt";
        Scanner sc = new Scanner(System.in);
        MyFile.write(fileName, sc.next());
        String textFromFile = MyFile.read(fileName);
        System.out.println(textFromFile);
        MyFile.update(fileName, sc.next());
        textFromFile = MyFile.read(fileName);
        System.out.println(textFromFile);
    }
}
