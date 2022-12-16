package ru.mirea.task27;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static HashMap<String, String> createTestMap()
    {
        HashMap<String, String> map = new HashMap<>();

        map.put("Duyan", "Furkan");
        map.put("Chubarov", "Gleb");
        map.put("Aynen", "Aynen aynen");
        map.put("Sidorov", "Semen");
        map.put("Ananas", "Ananasov");
        map.put("Sirorov", "Petr");
        map.put("Ivanov", "Viktor");
        map.put("Smirnov", "Viktor");
        map.put("Chernorukov", "Pop");
        map.put("Belorukov", "Petr");

        return map;
    }
    public static int getSameFirstNameCount(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }
    public static int getSameLastNameCount(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        HashMap<String, String> map;
        map = createTestMap();
        System.out.println(map);
        System.out.println(getSameFirstNameCount(map, "Gleb"));
        System.out.println(getSameLastNameCount(map, "Duyan"));
    }
}
