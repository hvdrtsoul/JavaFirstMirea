package ru.mirea.task25;

import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args){
        // Matching to ip adress pattern
        String pattern = "(((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))";
        System.out.println(Pattern.matches(pattern, "256.123.56.2"));
        System.out.println(Pattern.matches(pattern, "abc.123.56.2"));
        System.out.println(Pattern.matches(pattern, "250.34.123.56.2"));
        System.out.println(Pattern.matches(pattern, "26.123.56.2."));
        System.out.println(Pattern.matches(pattern, "26.123.56.2"));
        System.out.println(Pattern.matches(pattern, "255.255.255.0"));
    }
}
