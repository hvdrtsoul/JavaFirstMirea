package ru.mirea.task18;

public class Exception5 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException("Null key found while getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
        return "Get details for " + key; }

    public static void main(String[] args) {
        Exception5 exception5 = new Exception5();
        exception5.printMessage(null);
        exception5.printMessage("Set key");
    }
}
