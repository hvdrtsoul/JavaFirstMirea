package ru.mirea.task9;

public class Student implements Comparable<Student>{
    public String Name;
    public String Surname;
    public int age;

    public Student(String name, String surname, int age) {
        Name = name;
        Surname = surname;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return (Name+Surname+age).compareTo(o.Name+o.Surname+o.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", age=" + age +
                '}';
    }
}
