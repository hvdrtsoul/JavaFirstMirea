package ru.mirea.task31;

import org.junit.jupiter.api.Assertions;
import ru.mirea.task29.*;
import org.junit.jupiter.api.Test;

public class TestTableOrder {
    @Test
    public void  test1() throws OrderAlreadyAddedException {
        try {
            Dish dish1 = new Dish(1, "Борщ", "Описание1");
            Dish dish2 = new Dish(3, "Цезарь", "Описание2");
            Dish dish3 = new Dish(3, "Суп грибной", "Описание3");
            Drink dish4 = new Drink(3, "Сок гранатовый", "Описание4");
            Drink dish5 = new Drink(3, "Лимонад натахтари", "Описание5");
            Item[] arr1 = {dish1};
            Item[] arr2 = {dish2};
            OrderManager orderManager = new OrderManager();
            RestaurantOrder restaurantOrder = new RestaurantOrder(arr1);
            RestaurantOrder restaurantOrder2 = new RestaurantOrder(arr2);
            orderManager.addOrder("2", restaurantOrder); //делаем 2 заказа по одинаковому номеру стола
            orderManager.addOrder("2", restaurantOrder);
            Assertions.fail("No exception while it was expected");
        }
        catch (OrderAlreadyAddedException e){
            Assertions.assertNotEquals("", e.getMessage());
        }
    }
    @Test
    public void test2() throws IllegalTableNumber{
        try {
            Dish dish1 = new Dish(1, "Борщ", "Описание1");
            Dish dish2 = new Dish(3, "Цезарь", "Описание2");
            Dish dish3 = new Dish(3, "Суп грибной", "Описание3");
            Drink dish4 = new Drink(3, "Сок гранатовый", "Описание4");
            Drink dish5 = new Drink(3, "Лимонад натахтари", "Описание5");

            Item[] arr1 = {dish1};
            Item[] arr2 = {dish2};
            OrderManager orderManager = new OrderManager();
            RestaurantOrder restaurantOrder = new RestaurantOrder(arr1);
            InternetOrder internetOrder = new InternetOrder(arr2);
            orderManager.remove("\uD83D\uDE08");

            Assertions.fail("No exception while it was expected");
        } catch (IllegalTableNumber e) {
            Assertions.assertNotEquals("", e.getMessage());
        }
    }
}
