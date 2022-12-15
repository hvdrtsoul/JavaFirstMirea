package ru.mirea.task20;

public class Task2<T, V, K> {
    private T t;
    private V v;
    private K k;

    public Task2(T t, V v, K k) {
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
        return "Task 2{" +
                "T = " + t + "(class=" + t.getClass().getName() + ")" +
                ", V =" + v + "(class=" + v.getClass().getName() + ")" +
                ", K =" + k + "(class=" + k.getClass().getName() + ")" +
                '}';
    }

    public static void main(String[] args) {
        Task2<Integer, String, Double> task2 = new Task2<>(228, "dilli duduk", 69.0);
        System.out.println(task2);
    }
}
