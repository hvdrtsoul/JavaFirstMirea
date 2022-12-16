package ru.mirea.task13;

public class Person {
    private String surname;
    private String name = "";
    private String patronymic = "";

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Person(String surname) {
        this.surname = surname;
    }

    public String getFIO(){
        if(!name.isEmpty() && !patronymic.isEmpty())
            return surname + " " + name + " " + patronymic;
        else
            return surname;
    }
}


