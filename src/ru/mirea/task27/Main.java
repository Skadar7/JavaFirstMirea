package ru.mirea.task27;

import java.util.*;
import java.util.stream.Collectors;

class task1 {
    task1() {
        Map<String, String> Names = new HashMap<>();

        Names.put("Кузнецов", "Денис");
        Names.put("Андрианов", "Денис");
        Names.put("Сугробов", "Степан");
        Names.put("Шмат", "Алексей");
        Names.put("Кульбацкая", "Юлия");
        Names.put("Петрова", "Виктория");
        Names.put("Волков", "Александр");
        Names.put("Перун", "Анастасия");
        Names.put("Сивец", "Степан");
        Names.put("Фадеев", "Илья");

        System.out.printf("До: %s%n", Names);

        Set<String> existing = new HashSet<>();
        Names = Names.entrySet()
                .stream()
                .filter(entry -> existing.add(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.printf("После: %s%n", Names);
    }
}

class City {
    String city, country;

    public City(String city, String country) {
        this.city = city;
        this.country = country;
    }
}

public class Main {
    public static void main(String[] args) {
        new task1();

        City Moscow = new City("Москва", "Россия");
        City Volok = new City("Волоколамск", "Россия");
        City Istra = new City("Истра", "Россия");

        City NY = new City("Нью-Йорк", "США");
        City WT = new City("Вашингтон", "США");

        Map<String, ArrayList<String>> map = new HashMap<>();
        map.put(Moscow.country, new ArrayList<>(Arrays.asList(Moscow.city, Volok.city, Istra.city)));
        map.put(NY.country, new ArrayList<>(Arrays.asList(NY.city, WT.city)));

        System.out.println(map);
    }
}
