package ru.mirea.task31;

import org.junit.jupiter.api.Assertions;
import ru.mirea.task29.Dish;
import ru.mirea.task29.Drink;
import ru.mirea.task29.InternetOrder;
import ru.mirea.task29.Item;
import org.junit.jupiter.api.Test;

public class TestInternetOrder {
    @Test
    public void sorting_test(){
        Dish dish1 = new Dish(4, "Шашлык", "Описание1");
        Dish dish2 = new Dish(3, "Оливье", "Описание2");
        Drink drink1 = new Drink(5, "Вино красное", "Описание3");
        Item[] arr1 = {dish1, drink1, dish2};
        InternetOrder internetOrder = new InternetOrder(arr1);
        Item[] sorted = internetOrder.sort();
        Item[] expected = {drink1, dish1, dish2};
        Assertions.assertArrayEquals(sorted, expected);

    }
}
