package week5;

import java.util.Scanner;

public class UsingScanner {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      // exampleOne(in);
      // exampleTwo(in);
      exampleThree(in);
      in.close();
   }

   private static void exampleThree(Scanner in) {
      System.out.print("Please enter an integer: ");
      int num = 0;

      boolean validInput = false;

      while (!validInput) {
         try {
            num = Integer.parseInt(in.nextLine());
            validInput = true;
         } catch (Exception ex) {
            System.out.print("Invalid input, please enter an integer: ");
         }
      }

      System.out.println(Math.pow(num, 2));
   }

   /**
    * Uses nextInt - crashes if it is not an int
    * 
    * @param in
    */
   private static void exampleTwo(Scanner in) {
      System.out.print("Please enter an integer: ");
      int num = in.nextInt();
      System.out.println(Math.pow(num, 2));
   }

   private static void exampleOne(Scanner in) {

      System.out.print("Please enter your name: ");
      String name = in.nextLine();

      System.out.println("Hello " + name);
   }
}
