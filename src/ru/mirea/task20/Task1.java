package ru.mirea.task20;

public class Task1<T, V, K> {
    private T t;
    private V v;
    private K k;

    public Task1(T t, V v, K k) {
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
        return "task1{" +
                "T=" + t +
                ", V=" + v +
                ", K=" + k +
                '}';
    }

    public static void main(String[] args) {
        Task1<Integer, String, Double> task1 = new Task1<>(1, "2", 3.0);
        System.out.println(task1);
    }
}
