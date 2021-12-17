package ru.mirea.task31;

public class T31 {
}

class MatFunctions{
    static int Fibonacci(int d){
        int fib1=1, fib2=1;
        for(int i = 2; i<d; i++){
            int temp=fib2;
            fib2=fib2+fib1;
            fib1=temp;
        }
        return fib2;
    }

    static int pow(int d1, int d2){
        int result = 1;
        for(int i = 0; i<d2; i++){
            result*=d1;
        }
        return result;
    }

    static int factorial(int d){
        if (d<=0) return 1;
        int result=1;
        for(int i=1; i<=d; i++){
            result*=i;
        }
        return result;
    }
}
