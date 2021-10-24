package data_structures;


public class Player {
    Hand hand= new Hand();

    public Player(Hand hand) {
        this.hand = hand;
    }

    public boolean isBlackJack(){
        return hand.getHandSum() == 21;
    }
    public boolean hasBusted(){
        return hand.getHandSum() > 21;
    }
public int getSumOfHand(){
        return hand.getHandSum();
}
    public int getHandSize(){
        return hand.getHandLength();
    }
}
