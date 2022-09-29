package ru.mirea.task1;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] test = {1, 2, 3};

        countSum(test);
        countSumInput();
        printArgs(args);
        printHarmonica();
    }

    public static void countSum(int[] input) {
        int result = 0;

        for (int i = 0; i < input.length; ++i) {
            result += input[i];
        }

        System.out.println("Sum using for: " + result);
        System.out.println("Average is: " + (float)result / input.length);
    }

    public static void countSumInput(){
        int[] array = new int[1000];
        int length;
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter array size:");
        length = input.nextInt();

        System.out.println("Enter array elements one by one:");
        for(int i = 0;i < length;++i){
            array[i] = input.nextInt();
        }

        int result = 0;
        int min=0, max=0;

        int i = 0;

        while(i < length) {
            result += array[i];
            if(i == 0){
                min = array[i];
                max = array[i];
            }
            else{
                if(array[i] < min)
                    min = array[i];
                else if(array[i] > max)
                    max = array[i];
            }

            ++i;
        }

        System.out.println("Sum using while: " + result);
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);

        result = 0;
        i = 0;

        do{
            result += array[i];
            if(i == 0){
                min = array[i];
                max = array[i];
            }
            else{
                if(array[i] < min)
                    min = array[i];
                else if(array[i] > max)
                    max = array[i];
            }

            ++i;
        }while(i < length);

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
