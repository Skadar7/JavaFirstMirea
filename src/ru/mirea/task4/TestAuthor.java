package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] arg) {
        Author f = new Author("Denis", "denis@yandex.ru", 'M');
        Author s = new Author("Vika", "vika@mail.ru", 'F');

        System.out.println(f);
        System.out.println(s);

        f.setEmail("Peter@rambler.com");
        System.out.println(f.getEmail());

        System.out.println(s.getGender());
        System.out.println(f);
    }
}
