package week5;

public class FactorialExample {
   public static void main(String[] args) {
      int result = factorial(7);
      System.out.println(result);
   }

   private static int factorial(int n) {

      // 7! = 7 x 6 x 5 x4 x3 x 2 x1

      // 7! = 7 x 6!
      if (n == 1)
         return 1;
      else {
         return n * factorial(n - 1);
      }

   }

   private static int fibonacci(int n) {
      if (n == 1 || n == 2)
         return 1;
      else
         return fibonacci(n - 2) + fibonacci(n - 1);
   }

}
