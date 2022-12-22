package ru.mirea.task30;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        MenuItem dish1 = new Dish(3, "Стейк", "Описание стейка");
        MenuItem dish2 = new Dish(3, "Цезарь", "Описание цезаря");
        MenuItem dish3 = new Dish(2, "Суп грибной", "Описание грибного супа");
        MenuItem dish4 = new Dish(3, "Плов", "Описание плова");
        MenuItem dish5 = new Dish(4, "Пельмени", "Описание пельменей");
        MenuItem drink1 = new Drink(1, "Чай", "Описание чая", 0, DrinkTypeEnum.GREEN_TEA);
        MenuItem drink2 = new Drink(4, "Вино", "Описание вина", 0.15, DrinkTypeEnum.WINE);
        MenuItem drink3 = new Drink(9, "Bon aqua", "Описание воды", 0, DrinkTypeEnum.WATER);
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
        System.out.println("Стол 3");
        tm.getOrder(3).print();
        System.out.println();
        System.out.println("Стол 5");
        System.out.println("Свободные столики");
        System.out.println(Arrays.toString(tm.freeTableNumbers()));
        tm.remove(3);
        System.out.println(Arrays.toString(tm.freeTableNumbers()));

        InternetOrdersManager im = new InternetOrdersManager();
        Address a =new Address("moscow", 32, "lenina", 32, 'a', 4);
        Customer c = new Customer("ivan", "ivanov", 20, a);
        InternetOrder io = new InternetOrder();
        io.add(drink3);
        io.add(dish1);
        im.addOrder(io);
        System.out.println("\nИнтернет заказ");
        im.print();

    }
}