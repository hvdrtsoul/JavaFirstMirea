package ru.mirea.task1;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] test = {1, 2, 3};

        countSum(test);
        printArgs(args);
        printHarmonica();
        getRandomArray();
        System.out.println(getFactorial(19));
    }

    public static void countSum(int[] input) {
        int result = 0;

        for (int i = 0; i < input.length; ++i) {
            result += input[i];
        }

        System.out.println("Sum using for: " + result);

        result = 0;
        int i = 0;

        while (i < input.length) {
            result += input[i];
            ++i;
        }

        System.out.println("Sum using while: " + result);

        result = 0;
        i = 0;

        do {
            result += input[i];
            ++i;
        } while (i < input.length);

        System.out.println("Sum using do while: " + result);
    }

    public static void printArgs(String[] args) {

        for (String argument : args) {
            System.out.println(argument);
        }
    }

    public static void printHarmonica() {
        double currentMember = 0;

        for (int i = 1; i <= 10; ++i) {
            currentMember += (1.0 / i);
            System.out.print(currentMember + "\t");
        }
        System.out.println();
    }

    public static void getRandomArray() {
        Random generator = new Random();
        int[] randomInts = generator.ints(10).toArray();

        System.out.println("Not sorted: ");

        for (int number : randomInts)
            System.out.print(number + "\t");
        System.out.println();

        Arrays.sort(randomInts);
        System.out.println("Sorted: ");

        for (int number : randomInts)
            System.out.print(number + "\t");
        System.out.println();
    }

    public static long getFactorial(int input){
        long result = 1;

        for(int i = 2;i <= input;++i){
            result *= i;
        }

        return result;
    }
}
