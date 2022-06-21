import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> myCards;

    public Deck(){
        this.myCards = new ArrayList<Card>();

        for(int i = 0; i<15;i++){
            Card new_card = new Card("Diamond", i);
            this.myCards.add(new_card);
            //System.out.println(myCards);
        }
        for(int i = 0; i<15;i++){
            Card new_card = new Card("Spade", i);
            this.myCards.add(new_card);
        }
        for(int i = 0; i<15;i++){
            Card new_card = new Card("Heart", i);
            this.myCards.add(new_card);
        }
        for(int i = 0; i<15;i++){
            Card new_card = new Card("Club", i);
            this.myCards.add(new_card);
        }

    }

    public Card generateTopCard(){
        //method to return a top card to hand to player
        double randomValue = Math.random();
        int randomSelecter = (int) Math.round(randomValue);
        randomSelecter = randomSelecter * myCards.size();
        Card tempCard = myCards.get(randomSelecter);
        myCards.remove(randomSelecter);
        return tempCard;


    }

}
