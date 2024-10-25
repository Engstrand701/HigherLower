public class CardTest {

    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();

        System.out.println("Card 1 is " + card1);
        System.out.println("Card 2 is " + card2);

        if (card1.compareTo(card2) > 0) {
            System.out.println("Card 1 is the biggest ");
        } else if (card1.compareTo(card2) < 0) {
            System.out.println("Card 2 is the biggest ");
        } else {
            System.out.println("Card 1 and Card 2 are equal");
        }

    }

}