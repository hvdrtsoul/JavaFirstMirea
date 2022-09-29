package ru.mirea.task3;

public class Report {

    public static void generateReport(Employee[] input){
        System.out.printf("%-20s %20s %n", "Surname", "Salary");
        for(Employee employee : input)
            System.out.printf("%-20s %20.2f %n", employee.fullName, employee.salary);
    }
}
