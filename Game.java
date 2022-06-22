import java.util.ArrayList;

public class Game {
    public Deck deck;
    public ArrayList<Player> myPlayers;
    private int turnNumber;
    private int dealerNumber;



    public Game(){
        this.deck = new Deck();
        Player playerOne = new Player(0);
        Player playerTwo = new Player(1);
        Player playerThree = new Player(2);
        Player playerFour = new Player(3);
        this.myPlayers.add(playerOne);
        this.myPlayers.add(playerTwo);
        this.myPlayers.add(playerThree);
        this.myPlayers.add(playerFour);

    }

    public void dealCards(){
        //needs to be tested. The idea is that the function will go through each player
        //with the i%4 then the function add card to hand will add a rando card to each hand
        //till the deck is empty
        for(int i=0;i<52;i++){
            myPlayers.get(i%4).addCardToHand(deck.generateTopCard());
        }

    }


}
