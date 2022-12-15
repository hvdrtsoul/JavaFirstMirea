package ru.mirea.task20;

import java.io.Serializable;

public class Task3 <T extends Comparable<T>, V extends Animal & Serializable, K>{
    private T t;
    private V v;
    private K k;

    public Task3(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "Task 3{" +
                "t=" + t +
                ", v=" + v +
                ", k=" + k +
                '}';
    }

    public static void main(String[] args) {
        Task3<Integer, Dog, String> task3 = new Task3<Integer, Dog, String> (1, new Dog("Kedi", 2, "red"), "uaff uaff");
        System.out.println(task3);
    }
}
