package data_structures;

public class Hand extends Deck{



    public Card showFirstCard(){
        return this.cards.get(0);

    }

    public void getCard(Deck deck){
        this.cards.add(deck.cards.get(0));
        deck.cards.remove(0);

    }

    public int getHandSum(){
        int handSum=0;
        int numberOfAces=0;
        for(Card card:this.cards){

            switch(card.getValue()){
                case TWO -> handSum += 2;
                case THREE -> handSum+=3;
                case FOUR -> handSum+=4;
                case FIVE -> handSum+=5;
                case SIX -> handSum+=6;
                case SEVEN -> handSum+=7;
                case EIGHT -> handSum+=8;
                case NINE -> handSum+=9;
                case TEN, JACK, QUEEN, KING -> handSum+=10;
                case ACE -> {
                    numberOfAces++;
                    handSum+=1;
                }

                default -> throw new IllegalStateException("Unexpected value: " + card.getValue());
            }
            for(int i=0;i<numberOfAces;i++) {
                if (handSum + 10 <= 21) {
                    handSum += 10;
                }

            }
        }
        return handSum;
    }
    public int getHandLength(){
        return cards.size();
    }
}
