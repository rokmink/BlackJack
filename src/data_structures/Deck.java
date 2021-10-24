package data_structures;

import data_structures.cards_enum.Symbol;
import data_structures.cards_enum.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Deck  {
    private final int DECK_SIZE=52;
    protected ArrayList<Card> cards;
private    Random rand;
private static Deck instance;
    public Deck() {
        this.cards = new ArrayList<>();
    }

    public static Deck getInstance(){
        if(instance==null){
            instance=new Deck();
        }
        return instance;
    }


    public void removeDeck(){
        this.cards.clear();
    }

    public void createDeckOfCards(){
        for(Symbol symbol : Symbol.values()){
            for(Value value : Value.values()){
                this.cards.add(new Card(value,symbol));
            }
        }
    }
    public void shuffleDeck(){
        rand = new Random();
        for(int i=0;i<DECK_SIZE;i++){
            int r = i + rand.nextInt(DECK_SIZE- i);
            Collections.swap(cards,i,r);

        }

    }
    public void createDeckReadyForGame(){
        createDeckOfCards();
        shuffleDeck();

    }




    @Override
    public String toString() {
        String cardListOutput="";
        int numberOfCards=1;
        for(Card a:this.cards){
            cardListOutput+="\n"+numberOfCards+" "+a.toString();
            numberOfCards++;
        }
        return cardListOutput;
    }



}
