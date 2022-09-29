package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerCropie {
    List<Integer> cards;

    PokerCropie(){
        cards = new ArrayList<>();
        for(int i = 1;i <= 36;++i){
            cards.add(i);
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public void giveCards(int peopleNumber){
        if(peopleNumber > 7){
            System.out.println("Too much people...");
            return;
        }

        for(int i = 1;i <= peopleNumber*5;++i)
        {
            System.out.print(cards.remove(0));
            System.out.print(' ');

            if(i % 5 == 0)
                System.out.println("\n");
        }
    }
}
