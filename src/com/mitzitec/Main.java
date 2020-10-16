package com.mitzitec;

import java.util.Random;

public class Main
{

    public static void main(String args[])
    {

        int cantCard = 52;
        Deck miDeck = new Deck();
        miDeck.shuffle();
        System.out.println("--------------------");
        System.out.printf("Carta pedida: \n");

        for (int i = 0; i < 1; i++) {

            System.out.printf("%-20s\n",
                    miDeck.hand(), miDeck.hand(),
                    miDeck.hand(), miDeck.hand());
        }

        miDeck.pick();
        System.out.println("--------------------");
        System.out.println("Carta aleatoria: \n");
        for (int n = 7; n < 8; n++) {

            System.out.printf("%-20s\n",
                    miDeck.hand(), miDeck.hand(),
                    miDeck.hand(), miDeck.hand());
        }

        miDeck.head();
        System.out.println("--------------------");
        System.out.printf("Cartas en mano: \n");
        for (int m = 17; m < 22; m++) {
            System.out.printf("%-20s\n",
                    miDeck.hand(), miDeck.hand(),
                    miDeck.hand(), miDeck.hand());

        }
        miDeck.mano();
    }
}