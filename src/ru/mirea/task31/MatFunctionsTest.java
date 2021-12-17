package ru.mirea.task31;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class MatFunctionsTest {
    static boolean factorialTest=false;
    static boolean fibbonacciTest=false;
    static boolean powTest=false;

    @Test
    public void Fibonacci() {
        writeResults();
        Assert.assertEquals(1, MatFunctions.Fibonacci(1));
        Assert.assertEquals(1, MatFunctions.Fibonacci(2));
        Assert.assertEquals(2, MatFunctions.Fibonacci(3));
        Assert.assertEquals(3, MatFunctions.Fibonacci(4));
        Assert.assertEquals(5, MatFunctions.Fibonacci(5));
        fibbonacciTest=true;
        writeResults();
    }

    @Test
    public void pow() {
        writeResults();
        Assert.assertEquals(1, MatFunctions.pow(10, 0));
        Assert.assertEquals(100,MatFunctions.pow(10,2));
        Assert.assertEquals(25,MatFunctions.pow(5,2));
        Assert.assertEquals(4,MatFunctions.pow(-2,2));
        powTest=true;
        writeResults();
    }

    @Test
    public void factorial() {
        writeResults();
        Assert.assertEquals(1,MatFunctions.factorial(1));
        Assert.assertEquals(2,MatFunctions.factorial(2));
        Assert.assertEquals(6,MatFunctions.factorial(3));
        Assert.assertEquals(24,MatFunctions.factorial(4));
        Assert.assertEquals(1,MatFunctions.factorial(0));
        factorialTest=true;
        writeResults();
    }

    static void writeResults() {
        FileWriter fw;
        try {
            fw = new FileWriter("src\\ru\\mirea\\task31\\Test Result.md");

            fw.write("# Результаты тестирования \n");

            fw.write("## Факториал\n");
            if(factorialTest)
                fw.write("Успешно\n");
            else
                fw.write("Неудачно\n");

            fw.write("## Возведение в степень\n");
            if(powTest)
                fw.write("Успешно\n");
            else
                fw.write("Неудачно\n");

            fw.write("## Фиббоначи\n");
            if(fibbonacciTest)
                fw.write("Успешно\n");
            else
                fw.write("Неудачно\n");

            System.out.println("Результаты успешно записаны");
            fw.flush();
        }catch (IOException e){
            System.out.println("Ошибка: \n" + e.getMessage());
        }
    }
}
