package ru.mirea.task18;
import java.util.Scanner;

public class Store {
    String product;

    public void menu() { // начальный запрос данных
        System.out.println("Добрый день!");
        choose();

        try {
            order();
        } catch(IllegalAccessException exc) {
            exc.printStackTrace();
            System.exit(-1);
        }
    }

    public void choose() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой продукт вы бы хотели купить?");
        product = sc.nextLine();
    }

    public void order() throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        String ID;
        String FullName;

        System.out.println("Ваше имя: ");
        FullName = sc.nextLine();

        System.out.println("Введите ваш ИНН: ");
        ID = sc.next();

        if (ID.length() != 12) throw new IllegalAccessException("Некорректный ИНН!");

        System.out.println("Товар успешно куплен");
    }

    public static void main(String[] args) {
        Store st = new Store();
        st.menu();
    }
}
