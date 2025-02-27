package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class City{
    String city;
    String country;

    public City(String city, String country) {
        this.city = city;
        this.country = country;
    }
}

public class Task27_2 {
    public static void main(String[] args) {
        City[] cities = {
                new City("Москва", "Россия"),
                new City("Новороссийск", "Россия"),
                new City("Кёльн", "Германия"),
                new City("Берлин", "Германия"),
                new City("Лондон", "Англия"),
                new City("Эдинбурнг", "Англия"),
                new City("Токио", "Япония"),
                new City("Осака", "Япония"),
        };
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (City city : cities) {
            if (map.containsKey(city.country)) {
                map.get(city.country).add(city.city);
            }
            else {
                map.put(city.country, new ArrayList<>());
                map.get(city.country).add(city.city);
            }
        }
        System.out.println(map);
    }
}

