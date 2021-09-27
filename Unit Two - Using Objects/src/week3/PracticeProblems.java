package week3;

public class PracticeProblems {
   public static void main(String[] args) {
      questionA();
      question5();
   }

   public static void questionA() {
      int num = (int) (Math.random() * 100) + 1;
      System.out.println(num);
   }

   public static void question5() {
      int totalGames = 110 + 44;

      double winningPercentage = (int) ((110.0 / totalGames) * 1000) / 1000.0;
      System.out.println(winningPercentage);
   }
}
