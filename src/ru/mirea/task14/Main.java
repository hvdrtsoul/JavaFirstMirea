package ru.mirea.task14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Task2();
        //Task7();
        //Task3();
        Task4();
        //Task5();
        Task6();
    }

    public static void Task2(){
        String good = "abcdefghijklmnopqrstuv18340";
        String bad = "abcdefghijklmnoasdfasdpqrstuv18340";

        System.out.println(good + " matches? " + Pattern.matches("abcdefghijklmnopqrstuv18340", good));
        System.out.println(good + " matches? " + Pattern.matches("abcdefghijklmnopqrstuv18340", bad));
    }
    public static void Task3(){
        System.out.println("Enter text with the prices in single line: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        Pattern pattern = Pattern.compile("\\d+\\s(EU|USD|RUB)");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
    public static void Task4(){
        String good = "(1 + 8) – 9 / 4";
        String bad = "6 / 5 – 2 * 9";

        Pattern pattern = Pattern.compile("\\d\\s*\\+");
        Matcher goodMatcher = pattern.matcher(good);
        Matcher badMatcher = pattern.matcher(bad);

        System.out.println(good + " matches? " + goodMatcher.find());
        System.out.println(bad + " matches? " + badMatcher.find());
    }
    public static void Task5(){
        System.out.println("Enter the date in the next line: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println("Matches? " + Pattern.matches("([0-2][0-9]/[01][0-9]/[2-9][0-9][0-9][0-9])|" +
                "([0-2][0-9]/[01][0-9]/19[0-9][0-9])|(3[01]/[01][0-9&&[^2]]/[2-9][0-9][0-9][0-9])|" +
                "(3[01]/[01][0-9&&[^2]]/19[0-9][0-9])", text));
    }
    public static void Task6(){
        System.out.println("Enter an email in the next line: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println("Matches? " + Pattern.matches("[\\w\\.]+@[\\w\\.]+", text));
    }
    public static void Task7(){
        String text =  "F032_YouAreWrong";
        System.out.println("Is " + text + " a good password? " + (Pattern.matches("\\w*[A-Z]+\\w*", text) && Pattern.matches("\\w*\\d+\\w*", text)
                && Pattern.matches("\\w*[a-z]+\\w*", text)));
        text =  "WeirdPassword1";
        System.out.println("Is " + text + " a good password? " + (Pattern.matches("\\w*[A-Z]+\\w*", text) && Pattern.matches("\\w*\\d+\\w*", text)
                && Pattern.matches("\\w*[a-z]+\\w*", text)));
        text =  "am_i_okay";
        System.out.println("Is " + text + " a good password? " + (Pattern.matches("\\w*[A-Z]+\\w*", text) && Pattern.matches("\\w*\\d+\\w*", text)
                && Pattern.matches("\\w*[a-z]+\\w*", text)));
        text =  "B35";
        System.out.println("Is " + text + " a good password? " + (Pattern.matches("\\w*[A-Z]+\\w*", text) && Pattern.matches("\\w*\\d+\\w*", text)
                && Pattern.matches("\\w*[a-z]+\\w*", text)));
    }
}
