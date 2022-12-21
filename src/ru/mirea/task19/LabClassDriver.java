package ru.mirea.task19;

public class LabClassDriver {
    public static <EmptyStringException extends Throwable> void main(String[] args) throws EmptyStringException {
        LabClass labClass = new LabClass();
        LabClassUI ui = new LabClassUI(labClass);
        try {
            ui.run();
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessageRenamed());
        } catch (ru.mirea.task19.EmptyStringException e) {
            throw new RuntimeException(e);
        }
    }
}
