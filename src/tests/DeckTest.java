package tests;

import data_structures.Deck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void testShuffleDeck() {
        Deck deckShuffled=new Deck();
        Deck deckNotShuffled=new Deck();

        deckShuffled.createDeckOfCards();
        deckNotShuffled.createDeckOfCards();

        deckShuffled.shuffleDeck();




        assertNotSame(deckNotShuffled,deckShuffled);
    }
   @Test
    void testGetInstance(){
        Deck firstDeck=Deck.getInstance();
        Deck secondDeck=Deck.getInstance();



        assertEquals(firstDeck,secondDeck);
   }
   @Test
    void testCreateDeck(){
       Deck firstDeck=Deck.getInstance();
       Deck secondDeck=Deck.getInstance();

        firstDeck.createDeckOfCards();
//abiem iskart sukuria nes instance??
       assertEquals(firstDeck,secondDeck);
   }

}