package ru.mirea.task6;

public class TempConvert {

    public static void main(String[] args) {
    FarenTemp farenTemp = new FarenTemp(12.2f);
    KelvinTemp kelvinTemp = new KelvinTemp(45.98f);
        System.out.println("F TO C " + farenTemp.convert());
        System.out.println("K TO C " + kelvinTemp.convert());
    }
}
