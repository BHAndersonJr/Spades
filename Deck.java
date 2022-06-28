import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> myCards;

    public Deck(){
        this.myCards = new ArrayList<Card>();

        for(int i = 2; i<15;i++){
            Card new_card = new Card("Diamond", i);
            this.myCards.add(new_card);
            //System.out.println(myCards);
        }
        for(int i = 2; i<15;i++){
            Card new_card = new Card("Spade", i);
            this.myCards.add(new_card);
        }
        for(int i = 2; i<15;i++){
            Card new_card = new Card("Heart", i);
            this.myCards.add(new_card);
        }
        for(int i = 2; i<15;i++){
            Card new_card = new Card("Club", i);
            this.myCards.add(new_card);
        }

    }

    public Card generateTopCard(){
        //method to return a top card to hand to player
        //probably need more work here. returns the index 0 card a lot
        double randomValue = Math.random();
        int randomSelecter = (int) Math.round(randomValue);
        randomSelecter = randomSelecter * (myCards.size()-1);
        System.out.println(randomSelecter);
        Card tempCard = myCards.get(randomSelecter);
        myCards.remove(randomSelecter);
        return tempCard;


    }
    @Override
    public String toString(){
        String temp_value = "";
        for (int i =0;i<52;i++){
            temp_value += this.myCards.get(i);
            temp_value += "";

        }
        return temp_value;
    }

}