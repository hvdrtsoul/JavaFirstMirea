package ru.mirea.task32;

import ru.mirea.task30.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MenuItem dish1 = new Dish(3, "Стейк", "Описание стейка");
        MenuItem dish2 = new Dish(3, "Цезарь", "Описание цезаря");
        MenuItem dish3 = new Dish(2, "Суп", "Описание супа");
        MenuItem dish4 = new Dish(3, "Плов", "Вкусный плов");
        MenuItem dish5 = new Dish(4, "Пельмени", "Настоящие пельмени");
        MenuItem drink1 = new Drink(1, "Чай", "Описание чая", 0, DrinkTypeEnum.GREEN_TEA);
        MenuItem drink2 = new Drink(4, "Вино", "Черное вино", 0.15, DrinkTypeEnum.WINE);
        MenuItem drink3 = new Drink(9, "Bon aqua", "Expensive water", 0, DrinkTypeEnum.WATER);
        TableOrdersManager tm = new TableOrdersManager();
        tm.add(new TableOrder(), 3);
        tm.add(new TableOrder(), 5);
        tm.add(dish1, 3);
        tm.add(dish3, 3);
        tm.add(dish5, 3);
        tm.add(drink1, 3);
        tm.add(drink1, 3);

        tm.add(dish2, 5);
        tm.add(dish4, 5);
        tm.add(drink2, 5);

        InternetOrdersManager im = new InternetOrdersManager();
        Address adress =new Address("Kazan", 32, "Boumana", 11, 'e', 8);
        Customer c = new Customer("Furkan", "Duyan", 19, adress);
        InternetOrder io = new InternetOrder();
        io.add(drink3);
        io.add(dish1);
        im.addOrder(io);

        FileOutputStream outputStream = new FileOutputStream("SavedOrders.data"); // сериализация
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(im);
        objectOutputStream.writeObject(tm);

        objectOutputStream.close();
        System.out.println("Internet orders");
        FileInputStream fileInputStream = new FileInputStream("SavedOrders.data");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        InternetOrdersManager internet = (InternetOrdersManager) objectInputStream.readObject();
        TableOrdersManager table = (TableOrdersManager) objectInputStream.readObject();
        internet.print();
        System.out.println("\nTable orders");
        table.getOrder(5).print();
        System.out.println();
        table.getOrder(3).print();
        System.out.println("\n---Delete all teas---\n");
        table.getOrder(3).removeAll("Липтон");
        table.getOrder(3).print();
    }
}
