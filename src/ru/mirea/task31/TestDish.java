package ru.mirea.task31;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mirea.task29.Dish;

public class TestDish {
    @Test
    public void test2(){
        try {
            Dish dish1 = new Dish(-3, "Борщ", "bad apple");
            Assertions.fail("Expected exception");
        } catch (IllegalArgumentException e) {
            Assertions.assertNotEquals("", e.getMessage());
        }
    }
}
