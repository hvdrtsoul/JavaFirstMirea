package ru.mirea.task8;

public class Main {

    public static int countOnes(String[] strings, int currentPos, int metOnes, boolean gotZero){
        switch(strings[currentPos]){
            case "0":{
                if(gotZero){
                    return metOnes;
                }
                else
                {
                    return countOnes(strings, currentPos+1, metOnes, true);
                }
            }
            case "1":{
                return countOnes(strings, currentPos+1, metOnes + 1, false);
            }
            default:{
                return countOnes(strings, currentPos+1, metOnes, false);
            }
        }
    }

    public static void printAllUneven(String[] strings, int currentPos){

        if(strings[currentPos].equals("0")) return;

        if(Integer.valueOf(strings[currentPos]) % 2 == 1){
            System.out.println(strings[currentPos]);
        }
        printAllUneven(strings, currentPos + 1);

    }

    public static void printAllUnevenPos(String[] strings, int currentPos){
        if(strings[currentPos].equals("0")) return;

        if(currentPos % 2 == 1){
            System.out.println(strings[currentPos]);
        }
        printAllUnevenPos(strings, currentPos + 1);
    }

    public static void main(String[] args) {
        String[] strings = {"123", "2", "1", "0", "0"};

        System.out.println(countOnes(strings, 0, 0, false));
        printAllUneven(strings, 0);
        printAllUnevenPos(strings, 0);
    }
}
