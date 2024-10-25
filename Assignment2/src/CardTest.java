public class CardTest {  //B00793227

    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();
//This is to start trying and how to present the results wanted in the HigherLower game.
        System.out.println("Card 1 is " + card1);
        System.out.println("Card 2 is " + card2);

        if (card1.compareTo(card2) > 0) {
            System.out.println("Card 1 is the biggest ");
        } else if (card1.compareTo(card2) < 0) {
            System.out.println("Card 2 is the biggest ");//If guess is right, proceed, if nor Game over.
        } else {
            System.out.println("Card 1 and Card 2 are equal");// This would be a lose.
        }

    }

}