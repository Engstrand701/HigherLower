import java.util.Random;

public class HigherLower {
    /* Start with having the starting page for the rest of the programme
    to relate to.*/
    private final int RANK, SUIT;
    private static final Random GENERATOR = new Random();


    private static final String[] RANKS = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "Jack" , "Queen" , "King" , "Ace"};

    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    // Set up the arrays for other programmes to work.
    public Card() {
        RANK = GENERATOR.nextInt(RANKS.length);
        SUIT = GENERATOR.nextInt(SUITS.length);
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