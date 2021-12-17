package ru.mirea.task24;
import java.util.regex.Pattern;


class IP {
    public boolean task(String str) {
        String ip = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}$";
        return Pattern.matches(ip,str);
    }
}

public class Main {
    public static void main(String[] args) {
        IP ip = new IP();
        boolean my_ip;

        my_ip = ip.task("127.0.0.1");
        System.out.println(my_ip);
        my_ip = ip.task("255.255.255.0");
        System.out.println(my_ip);
        my_ip = ip.task("1300.6.7.8, abc.def.gha.bcd");
        System.out.println(my_ip);
    }
}
