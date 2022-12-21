package ru.mirea.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        getRandomArrayMethod();
        //getRandomArrayRandom();
        //fourRandomNumbers();
        //createAndOutEvens();

        Employee first = new Employee();
        first.fullName = "Ananas Ananasov";
        first.salary = 22.91;
        Employee second = new Employee();
        second.fullName = "Viktor Popov";
        second.salary = 12.4;

        Employee[] employees = {first, second};
        Report.generateReport(employees);
    }

    public static void getRandomArrayMethod() {
        double[] randomDoubles = new double[10];

        for(int i = 0;i < 10;++i){
            randomDoubles[i] = Math.random();
        }


        System.out.println("Not sorted: ");

        for (double number : randomDoubles)
            System.out.print(number + "\t");
        System.out.println();

        Arrays.sort(randomDoubles);
        System.out.println("Sorted: ");

        for (double number : randomDoubles)
            System.out.print(number + "\t");
        System.out.println();
    }

    public static void getRandomArrayRandom() {
        Random generator = new Random();
        double[] randomDoubles = generator.doubles(10).toArray();

        System.out.println("Not sorted: ");

        for (double number : randomDoubles)
            System.out.print(number + "\t");
        System.out.println();

        Arrays.sort(randomDoubles);
        System.out.println("Sorted: ");

        for (double number : randomDoubles)
            System.out.print(number + "\t");
        System.out.println();
    }

    public static void fourRandomNumbers(){
        Random generator = new Random();
        int[] randomInts = generator.ints(10, 10, 100).toArray();
        boolean isUp = true;
        int prevNumber = randomInts[0];
        System.out.print(randomInts[0] + "\t");

        for(int i = 1;i < 4;++i){
            System.out.print(randomInts[i] + "\t");
            if(randomInts[i] <= prevNumber)
                isUp = false;
            prevNumber = randomInts[i];
        }

        System.out.println("\n" + (isUp ? "Going up" : "Not going up"));
    }

    public static void createAndOutEvens(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the size of array:");
        int n = input.nextInt();
        Random generator = new Random();
        int[] randomInts = generator.ints(n).toArray();

        System.out.println("Random array is:");
        for (int number : randomInts)
            System.out.print(number + "\t");
        System.out.println();

        ArrayList<Integer> newArray = new ArrayList<>();

        for(int number : randomInts){
            if(number % 2 == 0)
                newArray.add(number);
        }

        System.out.println("Even elements of that array:");
        for (Integer number : newArray)
            System.out.print(number + "\t");
        System.out.println();

    }
}
