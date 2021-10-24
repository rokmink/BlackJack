import data_structures.*;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        BlackJack blackJack= new BlackJack();
       Scanner input= new Scanner(System.in);
        boolean game=true;
       String command;
       char move;
        while(game){
            System.out.println("Do you want to play? (Y or N)");
            command=input.next();
            move = command.toUpperCase().charAt(0);
            switch (move) {
                case 'Y':
                    blackJack.initializeGame();
                    blackJack.showPreGameCards();
                    blackJack.playGame();
                    blackJack.revealDealerCards();
                    blackJack.cleanGame();
                    break;
                case 'N':
                    game=false;
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }

        }
    }


}


