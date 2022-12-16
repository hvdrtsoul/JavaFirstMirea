package ru.mirea.task18;

import java.util.Scanner;

public class Exception8 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in
        );
        String key = myScanner.next();
        try {
            printDetails( key );
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            getKey();
        }
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        } catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception("Key can't be empty string");
        }
        return "Get details for " + key; }

    public static void main(String[] args) throws Exception {
        Exception8 exception8 = new Exception8();
        exception8.getKey();
    }
}
