package ru.mirea.task18;

public class Exception6 {
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
        Exception6 exception6 = new Exception6();
        exception6.printMessage(null);
        exception6.printMessage("Set key");
    }
}
