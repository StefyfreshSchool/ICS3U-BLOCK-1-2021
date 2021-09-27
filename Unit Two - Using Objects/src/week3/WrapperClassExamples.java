package week3;

public class WrapperClassExamples {
   public static void main(String[] args) {
      Integer n = new Integer(7);
      Double d = new Double(3.2);

      Integer num = 7; // auto boxing
      int m = num; // auto un-boxing

      int x = 6 + num; // auto-unboxing so we can add a primitive and object (wrapper) together
      int y = m + num;

      int z = num.intValue();
      // same as int z = num;
      double f = d.doubleValue();

      double d1 = 10.0;

      Double d2 = 20.0;

      Double d3 = new Double(30.0);

      double d4 = new Double(40.0);

      System.out.println(d1 + d2 + d3.doubleValue() + d4);

      System.out.println(Integer.MAX_VALUE); // Static constants that represent the largest and smallest possible ints
      System.out.println(Integer.MIN_VALUE);

   }
}
