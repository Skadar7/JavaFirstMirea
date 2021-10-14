package ru.mirea.task13.task3;

import java.lang.reflect.Array;

class MyArrayList <T> {
    private int size;
    private int actual_size = 0;
    private T[] array;

    public MyArrayList(Class<T> c, int size){
        this.size = size;
        array = (T[]) Array.newInstance(c, size);
    }

    public T get(int index){
        return array[index];
    }

    public int size(){
        return actual_size;
    }

    public void add(T item){
        int i = 0;
        while (i < size && array[i] != null){
            ++i;
        }

        if (size == i){
            System.out.println("Not enough space");
            return;
        }
        actual_size = i;

        array[i] = item;
    }

    public void set(int index, T item){
        array[index] = item;
    }

    public void remove(T item){
        int i = 0;
        while (i < size && array[i] != item){
            ++i;
        }

        if (size == i) {
            System.out.println("Item not found");
            return;
        }

        if (size - 1 - i >= 0) System.arraycopy(array, i + 1, array, i, size - 1 - i);

        array[size - 1] = null;
        actual_size--;

    }

    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList(Integer.class, 10);
        arr.add(1);
        arr.add(11);
        arr.add(34);
        arr.add(78);
        arr.add(0);

        System.out.println(arr.get(2));

        arr.set(3,10);

        arr.remove(5);

        System.out.println();
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}
