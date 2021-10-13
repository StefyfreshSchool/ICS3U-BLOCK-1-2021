package week6;

public class ForLoops {
   public static void main(String[] args) {
      whileLoop();
      forLoop();
      forLoop2();

      nestedLoops();
   }

   private static void nestedLoops() {
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 4; j++) {
            System.out.print('*');
         }
         System.out.println();
      }
   }

   private static void forLoop2() {
      int sum = 0;

      for (int i = 0; i <= 100; i += 2) {
         sum += i;
      }

      System.out.println(sum);
   }

   private static void forLoop() {
      int sum = 0;

      for (int i = 0; i <= 100; i++) {
         sum += i;
      }

      System.out.println(sum);
   }

   private static void whileLoop() {
      int i = 100;
      int sum = 0;
      while (i <= 100) {
         sum += i;
         i++;
      }

      System.out.println(sum);
   }
}
