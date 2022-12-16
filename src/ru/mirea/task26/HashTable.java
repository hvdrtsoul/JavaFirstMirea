package ru.mirea.task26;

import java.util.ArrayList;

public class HashTable
{
    public ArrayList<String> keys = new ArrayList<>();
    public ArrayList<String> values = new ArrayList<>();

    public void put(String key, String value) {
        if (this.keys.contains(key)) {
            this.values.set(this.keys.indexOf(key), value);
        } else {
            this.keys.add(key);
            this.values.add(value);
        }
    }

    public String getByKey(String key) {
        return this.values.get(this.keys.indexOf(key));
    }

    public void remove(String key) {
        this.values.remove(this.keys.indexOf(key));
        this.keys.remove(key);
    }

    public void sort() {
        for (int i = 0; i < this.keys.size(); i++) {
            for (int j = 0; j < this.keys.size() - 1; j++) {
                if (this.keys.get(j).compareTo(this.keys.get(j + 1)) > 0) {
                    String temp = this.keys.get(j);
                    this.keys.set(j, this.keys.get(j + 1));
                    this.keys.set(j + 1, temp);
                    temp = this.values.get(j);
                    this.values.set(j, this.values.get(j + 1));
                    this.values.set(j + 1, temp);
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < this.keys.size(); i++) {
            System.out.println(this.keys.get(i) + " " + this.values.get(i));
        }
    }

    public static void main(String[] args) {
        HashTable map = new HashTable();
        map.put("Name", "Furkan");
        map.put("surname", "Duyan");
        map.put("age", "19");
        System.out.println(map.getByKey("name"));
        System.out.println(map.getByKey("surname"));
        System.out.println(map.getByKey("age"));
        map.sort();
        map.print();
        map.remove("age");
        map.print();

    }
}
