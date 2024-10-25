import java.util.Random;  //B00793227

public class Card implements Comparable<Card>{
// Comparing index positions.
    private final int RANK, SUIT;
    private static final Random GENERATOR = new Random();
    private  String colour;
//The variables that pertain to a deck of cards.

    private static final String[] RANKS = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "Jack" , "Queen" , "King" , "Ace"};

    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

//This is for the shuffle.

    public Card() {
        RANK = GENERATOR.nextInt(RANKS.length);
        SUIT = GENERATOR.nextInt(SUITS.length);
        if (SUIT == 0 || SUIT ==3) colour = "Black";
        else colour = "Red";
    }

    public Card (int r, int s) {
        RANK = r;
        SUIT = s;
//Index used as integers.
    }

    public String getRank() {
        return  RANKS[RANK];

    }


    public String getSuit() {
        return SUITS[SUIT];

    }

    public int getRankValue() {
        return RANK;
    }

    public String getColour() {
        return colour;
    }


//To get cards at random.

    
    @Override
    public String toString() {
        return getRank() + " of " + getSuit();

    }

    @Override
    public int compareTo(Card otherCard) {
        if (this.getRankValue() > otherCard.getRankValue()) return 1;
        else if (this.getRankValue() < otherCard.getRankValue()) return -1;
        else return 0;
    }
}
