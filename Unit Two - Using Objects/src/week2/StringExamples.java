package week2;

public class StringExamples {
   public static void main(String[] args) {

      // Defined 3 references to String objects

      // When we use a String literal we are NOT constructing an instance of an Object
      String stringLiteral = "This is a String Literal";
      String anotherLiteral = "This is a String Literal";

      // The following 3 create 3 seperate instances of String Objects
      String somethingDifferent = new String("This is a String Literal"); // I am lying (It's not)
      String somethingDifferent2 = new String("This is a String Literal");
      String somethingDifferent1 = new String("This is a String Literal1");

      System.out.println(stringLiteral.length()); // last index is one less than the length of the String
      System.out.println(stringLiteral.equals(somethingDifferent)); // true if the same sequence of characters

      System.out.println(stringLiteral.indexOf("in"));
      System.out.println(stringLiteral.indexOf("happy"));

      System.out.println(stringLiteral.substring(3));
      System.out.println(stringLiteral.substring(3, 6)); // [startIndex, finalIndex) new String starting at Index 3 up
                                                         // to BUT NOT INCLUDEING 6 (indexes 3,4,5)

   }
}
