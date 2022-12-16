package ru.mirea.task19;

public class LabClassDriver {
    public static <EmptyStringException> void main(String[] args) {
        LabClass labClass = new LabClass();
        LabClassUI ui = new LabClassUI(labClass);
        try {
            ui.run();
        } catch (EmptyStringException e) {
            System.out.println(e.getMessageRenamed());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessageRenamed());
        }
    }
}
