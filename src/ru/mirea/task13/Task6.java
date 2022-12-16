package ru.mirea.task13;

public class Task6 {

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

}
