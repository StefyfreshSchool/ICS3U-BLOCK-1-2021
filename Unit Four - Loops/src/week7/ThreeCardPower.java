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
      System.out.println(playerHand);
   }

   private static String discard(Scanner in, String playerHand) {

      int numCardsToReplace = getNumber(in, "How many cards would you like to discard: ", 0, 3);
      String temp = playerHand;
      if (numCardsToReplace == 0)
         return playerHand;
      else if (numCardsToReplace == 3) {
         playerHand = getCard(playerHand + temp) + " ";
         playerHand += getCard(playerHand + temp) + " ";
         playerHand += getCard(playerHand + temp) + " ";
      } else {
         String cardToReplace = getCardsToDiscard(in, numCardsToReplace, playerHand);
         int space = cardToReplace.indexOf(" ");
         String card1 = cardToReplace.substring(0, space);
         String card = getCard(playerHand);
         playerHand = playerHand.replace(card1, card);
         if (numCardsToReplace == 2) {
            String card2 = cardToReplace.substring(space + 1);
            card = getCard(playerHand + cardToReplace);
            playerHand = playerHand.replace(card2, card);
         }
      }
      return playerHand;
   }

   private static String getCardsToDiscard(Scanner in, int numCardsToReplace, String playerHand) {
      final String VALID_CARDS = "AS2S3S4S5S6S7S8S9S10SJSQSKSAC2C3C4C5C6C7C8C9C10CJCQCKCAD2D3D4D5D6D7D8D9D10DJDQDKDAH2H3H4H5H6H7H8H9H10HJHQHKH";
      boolean validInput = false;
      String cards = "";
      while (!validInput) {
         System.out.println("Please enter the cards to replace: (ex. 7H KD): ");
         cards = in.nextLine().toUpperCase();

         if ((numCardsToReplace == 1) && (playerHand.indexOf(cards) < 0))
            System.out.println("You don't have a " + cards);
         else if ((numCardsToReplace == 1) && (playerHand.indexOf(cards) >= 0))
            validInput = true;
         else if (numCardsToReplace == 2) {
            int space = cards.indexOf(" ");
            if (space < 0) {
               System.out.println("You must choose two cards.");
            } else {
               String card1 = cards.substring(0, space);
               String card2 = cards.substring(space + 1);
               if (VALID_CARDS.indexOf(card1) < 0)
                  System.out.println("Not a valid card: " + card1);
               else if (VALID_CARDS.indexOf(card2) < 0)
                  System.out.println("Not a valid card: " + card2);
               if (cards.indexOf(card1) < 0)
                  System.out.println("You don't have a " + card1);
               else if (cards.indexOf(card2) < 0)
                  System.out.println("You don't have a " + card2);
               else if (card1.equals(card2))
                  System.out.println("You cannot discard the same card.");
               else
                  validInput = true;
            }
         }
      }

      return cards;

   }

   private static int getNumber(Scanner in, String prompt, int min, int max) {
      boolean validInput = false;
      int val = 0;
      while (!validInput) {
         System.out.print(prompt);
         try {
            val = Integer.parseInt(in.nextLine());

            if (val < min || val > max) {
               System.out.println("Invalid input!");
            } else {
               validInput = true;
            }
         } catch (Exception ex) {
            System.out.println("Invalid input!");
         }
      }
      return val;

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
