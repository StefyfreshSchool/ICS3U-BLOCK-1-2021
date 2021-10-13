package week6;

public class ECOOContests {
   public static void main(String[] args) {
      framingSquares(3, 4, 1, 2);
      diamonds("BAYVIEWGLEN");
      wordFrame("MAPLE");
   }

   private static void wordFrame(String str) {
      System.out.println("*" + str + "*");
      for (int i = 0; i < str.length(); i++) {
         String start = str.substring(i, i + 1);
         String end = str.substring(str.length() - i - 1, str.length() - i);
         System.out.print(end);
         for (int j = 0; j < str.length(); j++) {
            System.out.print("*");
         }
         System.out.println(start);
      }
      System.out.print("*");
      for (int i = 0; i < str.length(); i++) {
         String end = str.substring(str.length() - i - 1, str.length() - i);
         System.out.print(end);
      }
      System.out.println("*");
   }

   private static void diamonds(String str) {
      // FORWARD
      for (int i = 1; i < str.length(); i++) {
         System.out.print(" ");
      }
      System.out.println(str.substring(0, 1));
      for (int i = 1; i < str.length(); i++) {
         String letter = str.substring(i, i + 1);
         for (int j = 0; j < str.length() - i - 1; j++) {
            System.out.print(" ");
         }
         System.out.print(letter);
         for (int j = 0; j < 2 * i - 1; j++) {
            System.out.print(" ");
         }
         System.out.print(letter);

         System.out.println();

      }

      // BACKARD

      for (int i = str.length() - 2; i >= 1; i--) {
         String letter = str.substring(i, i + 1);
         for (int j = 0; j < str.length() - i - 1; j++) {
            System.out.print(" ");
         }
         System.out.print(letter);
         for (int j = 0; j < 2 * i - 1; j++) {
            System.out.print(" ");
         }
         System.out.print(letter);
         System.out.println();
      }

      for (int i = 1; i < str.length(); i++) {
         System.out.print(" ");
      }
      System.out.println(str.substring(0, 1));
   }

   /**
    * M - height of picture N - width of picture P - Padding/margin width Q - frame
    * width
    */
   private static void framingSquares(int M, int N, int P, int Q) {

      // TOP PART OF THE FRAME
      for (int i = 0; i < Q; i++) {
         for (int j = 0; j < N + 2 * P + 2 * Q; j++) {
            System.out.print("#");
         }
         System.out.println();
      }
      // Frame + Padding + Frame
      for (int i = 0; i < P; i++) {
         // FRAME
         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }
         for (int j = 0; j < 2 * P + N; j++) {
            System.out.print("+");
         }
         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }
         System.out.println();
      }
      // Frame + Padding + Picture + Padding + Frame
      for (int i = 0; i < M; i++) {
         // FRAME
         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }
         for (int j = 0; j < P; j++) {
            System.out.print("+");
         }
         for (int j = 0; j < N; j++) {
            System.out.print(".");
         }
         for (int j = 0; j < P; j++) {
            System.out.print("+");
         }
         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }
         System.out.println();
      }

      // Frame + Padding + Frame
      for (int i = 0; i < P; i++) {
         // FRAME
         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }
         for (int j = 0; j < 2 * P + N; j++) {
            System.out.print("+");
         }
         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }
         System.out.println();

      }
      // TOP PART OF THE FRAME
      for (int i = 0; i < Q; i++) {
         for (int j = 0; j < N + 2 * P + 2 * Q; j++) {
            System.out.print("#");
         }
         System.out.println();
      }

   }
}
