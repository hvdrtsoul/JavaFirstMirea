package ru.mirea.task26;

import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Furkan");
        hashMap.put("surname", "Duyan");
        hashMap.put("age", "19");

        System.out.println(hashMap.get("name"));
    }
}
