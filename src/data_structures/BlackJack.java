package data_structures;

import java.util.Scanner;

public class BlackJack {
   private Deck gameDeck;
   private Hand playerHand;
   private Hand dealerHand;
   private Dealer dealer;
   private Player player;

    public BlackJack(){
        gameDeck=Deck.getInstance();
       this.playerHand=new Hand();
        this.dealerHand=new Hand();
        this.dealer=new Dealer(dealerHand);
        this.player= new Player(playerHand);
    }

    public  void hitOrStand(){
        Scanner input= new Scanner(System.in);
        String command;
        char move='h';
        while(playerHand.getHandSum()<=21 && move!='S') {
            System.out.println("Hit (H) or Stand (S)?");
            command=input.next();
             move = command.toUpperCase().charAt(0);

            switch (move) {
                case 'H':
                    playerHand.getCard(gameDeck);
                    System.out.println("Your hands value: " + playerHand.getHandSum());
                    System.out.println(playerHand);
                    break;
                case 'S':
                    System.out.println("You chose to stand");
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }


    public void initializeGame(){

        gameDeck.createDeckReadyForGame();

        playerHand.getCard(gameDeck);
        playerHand.getCard(gameDeck);

        dealerHand.getCard(gameDeck);
        dealerHand.getCard(gameDeck);

    }
    public void showPreGameCards(){
        System.out.println("Your cards: ");
        System.out.println(playerHand);
        System.out.println("Your hands value: " + playerHand.getHandSum());

        System.out.println("Dealer hand: "+ dealerHand.showFirstCard());
    }
    public void determineWinner(){
        if(dealer.isBlackJack()&& player.isBlackJack()){
            System.out.println("You both got BlackJack! It's draw");
        }
        else if(player.isBlackJack() && player.getHandSize()==2){
            System.out.println("You got BlackJack!");
        }
        else if(player.hasBusted()){
            System.out.println("You busted: ");
        }
        else if(dealer.hasBusted()){
            System.out.println("You won, dealer busted ");
        }
        else if(player.getSumOfHand()> dealer.getSumOfHand()){
            System.out.println("You won: ");
        }
        else if(player.getSumOfHand()== dealer.getSumOfHand()){
            System.out.println("It's draw");
        }
        else if(player.getSumOfHand()< dealer.getSumOfHand()){
            System.out.println("You lost: ");
        }
    }
    public void cleanGame(){
        playerHand.removeDeck();
        dealerHand.removeDeck();
        gameDeck.removeDeck();
    }
    public void playGame(){
        hitOrStand();
        dealer.dealerPlay(gameDeck,player);
        determineWinner();
    }
    public void revealDealerCards(){
        System.out.println("Dealer score: "+ dealer.getSumOfHand()+dealerHand.toString());
    }

}
