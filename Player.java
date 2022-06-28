import java.util.ArrayList;

public class Player {


    public int playerNum;
    public ArrayList<Card> hand;

    public Player(int playerNumber){
        //need to test
        this.hand = new ArrayList<>();
        this.playerNum = playerNumber;
    }

    public void addCardToHand(Card card){
        //need to test
        this.hand.add(card);
    }

    public void printHand(){
        for(int i=0;i <this.hand.size()-1;i++){
            //need to test
            System.out.println(this.hand.get(i).getSuit() + this.hand.get(i).getValue());
        }


    }
    public int playerBid(){
        int bid = 0; //this needs to accept input from user
        return bid;


    }


}

