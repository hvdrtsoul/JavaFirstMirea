package ru.mirea.task27;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static <T> Set<T> hashToTree(Set<T> hashSet)
    {
        Set<T> treeSet = new TreeSet<>();
        treeSet.addAll(hashSet);

        return treeSet;
    }

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("AYNEN");
        hashSet.add("BARDAK");
        hashSet.add("HASIKTIR");

        Set<String> treeSet = hashToTree(hashSet);
        System.out.println(treeSet);
    }
}
