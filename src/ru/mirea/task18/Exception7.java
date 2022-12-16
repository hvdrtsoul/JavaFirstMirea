package ru.mirea.task18;

import java.util.Scanner;

public class Exception7 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in
        );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        } catch ( Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception("Key can't be empty string");
        }
        return "Get details for " + key; }

    public static void main(String[] args) throws Exception {
        Exception7 exception7 = new Exception7();
        exception7.getKey();
    }
}
