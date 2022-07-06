import java.util.ArrayList;

public class Game {
    public Deck deck;
    public ArrayList<Player> myPlayers;
    private int turnNumber;
    private int dealerNumber;
    private int gameScore;
    //need to decide on it teams should be a class type? going with no for right now because
    //players in this setup will always be on the same teams
    private int teamOneBid;
    private int teamTwoBid;
    private int teamOneScore;
    private int teamTwoScore;

    private String currentTrump;




    public Game(){
        this.deck = new Deck();
        this.gameScore = 200;
        this.teamOneBid = 0;
        this.teamTwoBid = 0;

        this.myPlayers = new ArrayList<Player>();
        Player playerOne = new Player(0);
        Player playerTwo = new Player(1);
        Player playerThree = new Player(2);
        Player playerFour = new Player(3);
        this.myPlayers.add(playerOne);
        this.myPlayers.add(playerTwo);
        this.myPlayers.add(playerThree);
        this.myPlayers.add(playerFour);

    }

    public void startGame(){


        System.out.println("Game Started");

        //first check and make sure the game isn't already over
        if (teamOneScore >= gameScore || teamTwoScore >= gameScore){
            System.out.println("Game is already over");
        } else {
            System.out.println("Time to play");
            //deal cards

            //collect bids

            //play cards 13 times

            //evaluate scores

            //repeate till one teams score equals or is greater than gamescore
        }
    }

    public void dealCards(){

        //needs to be tested. The idea is that the function will go through each player
        //with the i%4 then the function add card to hand will add a rando card to each hand
        //till the deck is empty
        System.out.println("the game score is "+this.gameScore);
        System.out.println("Team One score is "+this.teamOneScore);
        System.out.println("Team two score is "+this.teamTwoScore);

        for(int i=0;i<52;i++){
            myPlayers.get(i%4).addCardToHand(deck.generateTopCard());
        }
        //to show the different hands
        System.out.println("player 1 hand");
        this.myPlayers.get(0).printHand();
        System.out.println("player 2 hand");
        this.myPlayers.get(1).printHand();
        System.out.println("player 3 hand");
        this.myPlayers.get(2).printHand();
        System.out.println("player 4 hand");
        this.myPlayers.get(3).printHand();

    }



    public void colletBids(){
        //idea for this function will be to loop through the four players and collect their bids.
        //since 0 and 2 are always on team 1 they'll be added to teamOneBid and same for team2
        for(int i=0; i<4;i++) {

            int bid = this.myPlayers.get(i).playerBid();
            if (i == 0 || i == 2){
                this.teamOneBid += bid;
            } else{
                this.teamTwoBid += bid;
            }
        }
    }


}
