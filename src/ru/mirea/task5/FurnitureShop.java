package ru.mirea.task5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FurnitureShop {
    static ArrayList<Chair> chairs = new ArrayList<>();
    static ArrayList<Wardrobe> wardrobes = new ArrayList<>();
    static ArrayList<Desk> desks = new ArrayList<>();

    static void fillTheShop(){
        Random generator = new Random();
        for(int i = 0;i < 10;++i){
            Chair newChair = new Chair();
            Wardrobe newWardrobe = new Wardrobe();
            Desk newDesk = new Desk();

            newChair.setPrice(generator.nextInt(100, 999));
            newDesk.setPrice(generator.nextInt(100, 999));
            newWardrobe.setPrice(generator.nextInt(100, 999));

            chairs.add(newChair);
            wardrobes.add(newWardrobe);
            desks.add(newDesk);
        }
    }

    public static void main(String[] args) {
        fillTheShop();
        System.out.println("Hi! What do you wanna buy?\n" +
                "1 - chair\n" +
                "2 - wardrobe\n" +
                "3 - desk");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        Random generator = new Random();
        int furnitureNumber = generator.nextInt(0, 10);

        switch(option){
            case 1:
                System.out.println("You just bought chair number " + furnitureNumber + " for " + chairs.get(furnitureNumber).getPrice());
                chairs.remove(furnitureNumber);
                break;
            case 2:
                System.out.println("You just bought wardrobe number " + furnitureNumber + " for " + wardrobes.get(furnitureNumber).getPrice());
                chairs.remove(furnitureNumber);
                break;
            case 3:
                System.out.println("You just bought desk number " + furnitureNumber + " for " + desks.get(furnitureNumber).getPrice());
                chairs.remove(furnitureNumber);
                break;
        }
    }
}
