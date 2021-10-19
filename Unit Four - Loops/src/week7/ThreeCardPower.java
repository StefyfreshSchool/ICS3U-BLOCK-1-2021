package week7;

import java.util.Scanner;

public class ThreeCardPower {

   private static final String HEARTS = "H";
   private static final String CLUBS = "C";
   private static final String DIAMONDS = "D";
   private static final String SPADES = "S";

   private static final String ACE = "A";
   private static final String KING = "K";
   private static final String QUEEN = "Q";
   private static final String JACK = "J";
   private static final int MAX_CARDS = 3;

   public static void main(String[] args) {
      // 7H -> 7 of Hearts
      // AD -> Ace of Diamonds
      // KC -> King of Clubs

      // playerHand => "7H AD KC"
      // dealerHand => "XX XX XX"
      final int MIN_BET = 50;
      final int MAX_BET = 100;
      Scanner in = new Scanner(System.in);
      int wallet = 500;
      // int bet = getBet(in, wallet, MIN_BET, MAX_BET);
      String playerHand = "";
      for (int i = 0; i < MAX_CARDS; i++) {
         playerHand += getCard(playerHand) + " ";
      }
      System.out.println(playerHand);

      playerHand = discard(in, playerHand);
   }

   private static String discard(Scanner in, String playerHand) {
      // ask the user how many cards they would like to replace.
      // make sure it is between 0 and 3 - valid input only
      int numCardsToReplace = getNumber(in, "How many cards would you like to discard: ", 0, 3);

      // prompt them the cards to replace (if the pick 2 the they should enter 3H 7D
      // and if they pick 1 it should look like AD)

      // return the new hand

   }

   private static int getNumber(Scanner in, String prompt, int min, int max) {
      return 0;
   }

   private static String getCard(String cardsUsed) {
      String card = getFace() + getSuit();

      while (cardsUsed.indexOf(card) >= 0) {
         card = getFace() + getSuit();
      }

      return card;
   }

   private static String getSuit() {
      int suit = (int) (Math.random() * 4);
      if (suit == 0)
         return HEARTS;
      else if (suit == 1)
         return SPADES;
      else if (suit == 2)
         return CLUBS;
      else
         return DIAMONDS;
   }

   private static String getFace() {
      int face = (int) (Math.random() * 13) + 1;
      if (face > 1 && face < 11)
         return "" + face;
      else if (face == 1)
         return ACE;
      else if (face == 11)
         return JACK;
      else if (face == 12)
         return QUEEN;
      else
         return KING;
   }

   private static int getBet(Scanner in, int wallet, int minBet, int maxBet) {
      boolean validInput = false;

      int bet = 0;
      while (!validInput) {
         System.out.print("Please enter a wager [$" + minBet + " - $" + maxBet + "]: $");
         try {
            bet = Integer.parseInt(in.nextLine());

            if (bet > wallet)
               System.out.println("You do not have that much money in your wallet. $" + wallet + " is all you have.");
            else if (bet < minBet || bet > maxBet) {
               System.out.println("You must make a bet between $" + minBet + " - $" + maxBet);
            } else {
               validInput = true;
            }
         } catch (Exception ex) {
            System.out.println("Invalid Bet!");
         }
      }

      return bet;
   }
}
