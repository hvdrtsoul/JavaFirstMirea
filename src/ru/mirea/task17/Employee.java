package ru.mirea.task17;

public class Employee {
    private String nameSurname;
    private int id;
    private int salary;
    public Employee(String name, int id, int salary) {
        this.nameSurname = name;
        this.id = id;
        this.salary = salary;
    }
    public String getNameSurname() {
        return nameSurname;
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
