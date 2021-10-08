package week6;

import java.util.Scanner;

public class WhileLoopExamples {
   public static void main(String[] args) {
      exampleOne();
      int sum = getSumInclusive(1, 100);
      System.out.println(sum);
      int numVowels = countVowels("This is a sentence with VOWELS!");
      System.out.println(numVowels);

      Scanner in = new Scanner(System.in);
      int num = getValidInput(10, 20);

   }

   private static int getValidInput(int i, int j) {
      return 0;
   }

   /**
    * // What does the method do
    * 
    * @param start - int that represents where to start counting
    * @param end
    * @return
    */

   /** */
   private static int getSumInclusive(int start, int end) {
      int count = start;
      int sum = 0;
      while (count <= end) {
         sum += count;
         count++;
      }

      return sum;
   }

   private static int countVowels(String str) {
      int numVowels = 0;
      int index = 0;
      String vowels = "AEIOUaeiou";

      while (index < str.length()) {
         String nextChar = str.substring(index, index + 1);
         if (vowels.indexOf(nextChar) >= 0)
            numVowels++;
         index++;
      }

      return numVowels;

   }

   private static void exampleOne() {
      // sum he numbers from 1 - 100 and display on the screen
      int count = 1;
      int sum = 0;

      while (count <= 100) {
         sum += count;
         count++;
      }

      System.out.println(sum);
   }
}
