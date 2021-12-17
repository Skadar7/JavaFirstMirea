package ru.mirea.task26;

import java.util.Scanner;

interface Payment { public void pay(String product); }

class E_wallet implements Payment {
    public void pay(String product) {
        System.out.println("Вы выбрали " + product);
        System.out.println("Вы оплатили заказ наличными!");
    }
}

class Credit implements Payment {
    public void pay(String product) {
        System.out.println("Вы выбрали " + product);
        System.out.println("Вы оплатили заказ картой!");
    }
}

class Store {
    String product, wallet;
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("Что хотите купить?");

        product = sc.nextLine();

        System.out.println("Выберите способ оплаты:");
        System.out.println("Наличными || Картой");
        wallet = sc.nextLine();

        switch (wallet) {
            case "Наличными":
                Payment e_wallet = new E_wallet();
                e_wallet.pay(product);
                break;

            case "Картой":
                Payment credit = new Credit();
                credit.pay(product);
                break;

            default:
                System.out.println("Ой");
                break;
        }

        return;
    }
}

public class Main {
    public static void main(String[] args) {
        Store st = new Store();
        st.start();
    }
}
