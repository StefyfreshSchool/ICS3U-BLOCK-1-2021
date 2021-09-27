package week3;

public class RandomExamples {
   public static void main(String[] args) {
      double r = Math.random();
      // System.out.println(r); // random number between 0.0 and 1.0 (not including
      // 1.0 - example 0.545854747)

      // Random number between lower and upper bound
      int lower = -5;
      int upper = 5;

      int result = (int) ((upper - lower + 1) * r) + lower;

      String str = "Random numbers";

      // change a random character in the string to a x

      int index = (int) (Math.random() * str.length());

      str = str.substring(0, index) + "x" + str.substring(index + 1);
      System.out.println(str);

   }
}
