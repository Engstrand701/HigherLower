import java.util.Scanner;  //B00793227

public class HigherLower {
    private static final int NUMCARDS = 5;
    private int score1 = 0;

    public static void main(String[] args) {
        Deck deck = new Deck();
        int score;
        score =0;

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream


        //exit = sc.(inputString.equalsIgnoreCasee())break;
        //while (sc !=e) {
        boolean demo = false;
        int numberOfCards;
        boolean anotherGame = true;// this is where I want to enable user to play another or quit.
        while (anotherGame) {
            deck = new Deck();
            System.out.println("If you want a demo, type D or N to play the game.  ");
            String inputString = sc.next();
                 if (inputString.equalsIgnoreCase("d"))
                 demo = true;
           else if (inputString.equalsIgnoreCase("n"))
                    demo = false;
                System.out.println(demo);

            if (demo == false)  {
                System.out.print("Enter first number- ");
                 numberOfCards = sc.nextInt();
            }
            else numberOfCards = 52;

            /*deal5cards();

    }

    public static void deal5cards() {
        Card[] player1 = new Card[NUMCARDS];
        Deck deck = new Deck();
        for (int i = 0; i < NUMCARDS; i++) {
            player1[i] = deck.deal();

        }
        for (int i = 0; i < NUMCARDS; i++) {
            System.out.println(player1[i]);
        Want to start the first game dealing five cards.

        }*/


            Card[] player1 = new Card[numberOfCards];
            for (int i = 0; i < numberOfCards; i++) {
               player1[i] = deck.deal();
            }
            int i = 0;
            while (i < numberOfCards - 1) {


                System.out.println(player1[i] + "\nType H if you think the next card is higher than card 1 or L if lower.");
                //I want the game to operate then to start counting the score.
                if (demo == false) {
                System.out.println("H if higher or L if lower, or S for Stick.");
               inputString = sc.next();}
                else {
                    if (player1[i].getRankValue() < 4) inputString = "h";
                    else if (player1[i].getRankValue() > 8) inputString = "l";
                    else inputString = "S";
                }


                    System.out.println(player1[i + 1]);
                    //System.out.println(card1.compareTo(card2));
                    //System.out.println(inputString.equalsIgnoreCase("l"));
                    //System.out.println(inputString.equalsIgnoreCase("h"));
                    if (player1[i].compareTo(player1[i + 1]) == 1 && inputString.equalsIgnoreCase("l")) {
                        System.out.println("Good Guess ");
                        score++;
                    }
               /*This is so the player can keep the score and decide whether to play another game.
               {System.out.println("Press S to hold your current score or guess to continue.  "); &&
                        inputString.equalsIgnoreCase("s" )== break;  }*/
                    else if (player1[i].compareTo(player1[i + 1]) == 1 && inputString.equalsIgnoreCase("h")) {
                        System.out.println("Game Over ");
                        break;
                    } else if (player1[i].compareTo(player1[i + 1]) == -1 && inputString.equalsIgnoreCase("l")) {
                        System.out.println("Game Over ");
                        break;
                    } else if (player1[i].compareTo(player1[i + 1]) == -1 && inputString.equalsIgnoreCase("h")) {
                        System.out.println("Good Guess ");
                        score++;
                    }
               /*This is so the player can keep the score and decide whether to play another game.
               {System.out.println("Press S to hold your current score or guess to continue.  "); &&
                        inputString.equalsIgnoreCase("s" )== break;  }*/

                    else if (player1[i].compareTo(player1[i + 1]) == 0) {
                        System.out.println("Game Over!");
                        break;
                    } else if (inputString.equalsIgnoreCase("s")) {
                        System.out.println("You have stayed at this score ");
                        break;
                    }

                i++;

            }
            System.out.println("The Score is " + score);
            score = 0;//I want it, if there is another name, the need to enter name should not come up.
            System.out.println("Would you like to play another game? press y for Yes and n for No.");
            inputString = sc.next();
            if (inputString.equalsIgnoreCase("y") == true) anotherGame = true;
           else anotherGame = false;


        }
        anotherGame = false;
             System.out.println("Enter Name  " +  "\tScore" + score);
            score =score++;
             sc.next();

    }

    //Priority Queue of Scores.

}