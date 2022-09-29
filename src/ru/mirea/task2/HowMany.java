package ru.mirea.task2;

import java.util.Scanner;

public class HowMany {
    void countWords(){
        System.out.println("Start inputing words. To end, input empty string");
        Scanner input = new Scanner(System.in);
        int result = 0;

        while(true) {
            String s = input.nextLine();
            if(s.isEmpty()){
                System.out.println("There were totally " + result + " words");
                return;
            }

            result += s.split(" ").length;
        }
    }
}
