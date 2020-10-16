package com.mitzitec;

import java.util.Random;

public class Deck {
    private Card paquete[];
    private int cartaActual;
    private final int NUMERO_DE_CARTAS = 52;
    private Random numerosAleatorios;
    int cantCard = 52;


    public Deck() {

        String caras[] = {"AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE",
                "OCHO", "NUEVE", "DIEZ", "JOTO", "QUINA", "REY"};
        String palos[] = {"CORAZONES", "DIAMANTES", "TREBOLES", "ESPADAS"};
        String color[] = {" ROJA", " NEGRA", " ROJA", " NEGRA"};


        paquete = new Card[NUMERO_DE_CARTAS];
        cartaActual = 0;
        numerosAleatorios = new Random();

        for (int cuenta = 0; cuenta < paquete.length; cuenta++)
            paquete[cuenta] = new Card(caras[cuenta % 13], palos[cuenta / 13], color[cuenta / 13]);

    }


    public void shuffle() {
        cartaActual = 0;

        for (int primera = 0; primera < paquete.length; primera++) {
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);

            Card temp = paquete[primera];

            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;


        }
        System.out.println("Se barajearon las cartas");

    }

    public void pick() {
        cantCard = cantCard - 1;
        System.out.println("Quedan " + cantCard + " en el mazo");
    }

    public void head() {
        cantCard = cantCard - 1;
        System.out.println("Quedan " + cantCard + " en el mazo");
    }

    public Card hand() {
        if (cartaActual < paquete.length)
            return paquete[cartaActual++];
        else return null;

    }

    public void mano() {
        cantCard = cantCard - 5;
        System.out.println("Quedan " + cantCard + " en el mazo");
    }
}