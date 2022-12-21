package ru.mirea.task13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //checkString("I like Java!!!");
        checkPerson();
        //testShirt();
        testWordsAlligner();
    }

    public static void checkString(String input){
        System.out.println("Last char of the string is " + input.charAt(input.length()-1));
        System.out.println(input.endsWith("!!!") ? "Ends with !!!" : "Doesn't end with !!!");
        System.out.println(input.startsWith("I like") ? "Starts with I like" : "Doesn't start with I like");
        System.out.println(input.contains("Java") ? "Contains Java" : "Doesn't contain Java");
        System.out.println("Position Of Java substring is " + input.lastIndexOf("Java"));
        input = input.replaceAll("a", "o");
        System.out.println("Replaced string: " + input);
        input = input.toUpperCase();
        System.out.println("Uppercase string " + input);
        input = input.toLowerCase();
        System.out.println("Lowercase string " + input);
        int index = input.lastIndexOf("jovo");
        String substring = input.substring(index, index + "Java".length());
        System.out.println("Found substring: " + substring);
    }

    public static void checkPerson(){
        Person me = new Person("Chubarov", "Gleb", "Viacheslavovich");
        Person him = new Person("Duyan");

        System.out.println("Me: " + me.getFIO());
        System.out.println("Him: " + him.getFIO());
    }

    public static void testShirt(){
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirtsObjects = new Shirt[11];

        for(int i = 0;i < 11;++i){
            shirtsObjects[i] = new Shirt(shirts[i]);
            System.out.println("Added shirt: " + shirtsObjects[i]);
        }
    }

    public static StringBuilder getLine(String line){
        String[] words = line.split(" ");
        StringBuilder result = new StringBuilder("");

        for(int i = 0;i < words.length - 1;++i)
            for(int j = i + 1;j < words.length;++j){
                if(words[i].charAt(words[i].length()-1) == words[j].charAt(0)){
                    result.insert(result.length(), words[i] + " ");
                    result.insert(result.length(), words[j] + " ");
                    break; // So each of the words would be used only once
                }
            }
        return result;
    }

    public static void testWordsAlligner(){
        try {
            FileReader fileReader = new FileReader("C:\\Users\\kd004\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task13\\broken_hearts.txt");
            Scanner fileScanner = new Scanner(fileReader);
            String line = fileScanner.nextLine();
            System.out.println("Result is: " + getLine(line));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}


