package ru.mirea.task3;

public class Wrappers {
    public static void main(String[] args) {
        Double first = Double.valueOf(3.5);
        Double second = Double.valueOf(82.2);
        String doubleString = "14.11";
        double third = Double.parseDouble(doubleString);

        byte byteValue = first.byteValue();
        double doubleValue = first.doubleValue();
        float floatValue = first.floatValue();
        int intValue = first.intValue();
        long longValue = first.longValue();

        System.out.println(second);
        String stringDouble = Double.toString(4.45);
    }
}
