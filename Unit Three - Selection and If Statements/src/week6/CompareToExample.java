package week6;

public class CompareToExample {
   public static void main(String[] args) {
      System.out.println("abce".compareTo("bcd")); // "bcd" > "abcd"

      // System.out.println("a".compareTo("g"));
      // System.out.println("g".compareTo("a"));
      // System.out.println("g".compareTo("g"));
      // System.out.println("g".compareTo("G"));
      System.out.println("go".compareTo("get")); // "go" > "get" because "o" > "e"

      System.out.println("go".compareTo("goo"));
      System.out.println("goo".compareTo("go"));
   }
}
