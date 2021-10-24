package tests;

import data_structures.Deck;
import data_structures.Hand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {

    @Test
    void testGetHandLengthWhenCardNumberIs3(){
        Deck deck=Deck.getInstance();
        deck.createDeckOfCards();
        Hand hand=new Hand();

        hand.getCard(deck);
        hand.getCard(deck);
        hand.getCard(deck);

        assertEquals(hand.getHandLength(),3);

    }
    @Test
    void testGetHandLengthWhenCardNumberIs2(){
        Deck deck=Deck.getInstance();
        deck.createDeckOfCards();
        Hand hand=new Hand();

        hand.getCard(deck);
        hand.getCard(deck);


        assertEquals(hand.getHandLength(),2);

    }
    @Test
    void testGetHandLengthWhenCardNumberIs1(){
        Deck deck=Deck.getInstance();
        deck.createDeckOfCards();
        Hand hand=new Hand();

        hand.getCard(deck);


        assertEquals(hand.getHandLength(),1);

    }


}