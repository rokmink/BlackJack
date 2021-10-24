package data_structures;


public class Dealer extends Player {

    public Dealer(Hand hand) {
        super(hand);
    }

    public void dealerPlay(Deck gameDeck,Player player){
        int dealerScore=hand.getHandSum();
        while(dealerScore<17 &&!player.hasBusted()){
            System.out.println("Dealer has: "+dealerScore+" and Hits!");
            hand.getCard(gameDeck);
            dealerScore=hand.getHandSum();

        }
    }


}
