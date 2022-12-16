package ru.mirea.task11;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Task1();
        //Task2();
        Task5();
    }

    public static void Task1() throws InterruptedException {
        Calendar currentDate = new GregorianCalendar();
        System.out.println("Developer Name: Furkan Duyan");
        System.out.println("Task accepted at: " + currentDate.getTime());

        System.out.println("Task in progress...");
        Thread.sleep(3000);
        Date completedDate = new Date();
        System.out.println("Furkan Duyan completed his assignment at: " + completedDate);
    }

    public static void Task2(){
        Calendar input = new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        System.out.println("Entering date...");
        System.out.print("Enter year: ");
        input.set(Calendar.YEAR, in.nextInt());
        System.out.print("Enter month: ");
        input.set(Calendar.MONTH, in.nextInt());
        System.out.print("Enter day: ");
        input.set(Calendar.DAY_OF_MONTH, in.nextInt());
        System.out.print("Enter hour: ");
        input.set(Calendar.HOUR_OF_DAY, in.nextInt());
        System.out.print("Enter minute: ");
        input.set(Calendar.MINUTE, in.nextInt());
        System.out.print("Enter second: ");
        input.set(Calendar.SECOND, in.nextInt());

        Calendar currentTime = new GregorianCalendar();

        if(currentTime.after(input)){
            System.out.println("Current time is larger than inputed");
        }else{
            System.out.println("Current time is smaller than inputed");
        }
    }

    public static void Task5(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long timer = System.nanoTime();
        arrayList.add(69);
        timer = System.nanoTime() - timer;
        System.out.println("Added to array list by time: ");
        System.out.printf("%,9.3f ms\n", timer / 1_000_000.0);

        timer = System.nanoTime();
        linkedList.add(69);
        timer = System.nanoTime() - timer;
        System.out.println("Added to linked list by time: ");
        System.out.printf("%,9.3f ms\n", timer / 1_000_000.0);

        timer = System.nanoTime();
        arrayList.add(0, 5);
        timer = System.nanoTime() - timer;
        System.out.println("Inserted by index to array list by time: ");
        System.out.printf("%,9.3f ms\n", timer / 1_000_000.0);

        timer = System.nanoTime();
        linkedList.add(0, 5);
        timer = System.nanoTime() - timer;
        System.out.println("Inserted by index to linked list by time: ");
        System.out.printf("%,9.3f ms\n", timer / 1_000_000.0);

        timer = System.nanoTime();
        arrayList.remove(1);
        timer = System.nanoTime() - timer;
        System.out.println("Removed by index from array list by time: ");
        System.out.printf("%,9.3f ms\n", timer / 1_000_000.0);

        timer = System.nanoTime();
        linkedList.remove(1);
        timer = System.nanoTime() - timer;
        System.out.println("Removed by index from linked list by time: ");
        System.out.printf("%,9.3f ms\n", timer / 1_000_000.0);

        timer = System.nanoTime();
        int testGet = arrayList.get(0);
        timer = System.nanoTime() - timer;
        System.out.println("Get by index from array list by time: ");
        System.out.printf("%,9.3f ms\n", timer / 1_000_000.0);

        timer = System.nanoTime();
        testGet = linkedList.get(0);
        timer = System.nanoTime() - timer;
        System.out.println("Get by index from linked list by time: ");
        System.out.printf("%,9.3f ms\n", timer / 1_000_000.0);
    }
}
