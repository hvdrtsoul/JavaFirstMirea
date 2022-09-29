package ru.mirea.task4_1;

class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone(23432, "Model1", 23.2);
        Phone phone2 = new Phone(24575521, "Model2");
        Phone phone3 = new Phone();

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Alex");
        phone2.receiveCall("Ivan");
        phone3.receiveCall("Gru");

        phone3.receiveCall("Stopper", phone1.getNumber());

        phone1.sendMessage(phone1.getNumber(), phone2.getNumber());
    }
}