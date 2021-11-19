package week11;

public class ForEachLoop {
   public static void main(String[] args) {
      int[] arr = { 30, 20, 5, 70, 90, 85, 10 };

      // for each is when you want to iterate through the array / ArrayList
      // Do not need the index
      // cannot change the size of the arraylist (add or remove elements)

      int sum = 0;

      // for (var for next element : array / arraylist)

      for (int el : arr) {
         sum += el;
      }

      String[] words = { "Test", "Alphabet", "Steve", "baseball", "Leafs" };

      String vowels = "aeiouAEIOU";
      int numVowels = 0;
      for (String w : words) {
         for (int i = 0; i < w.length(); i++) {
            String letter = w.substring(i, i + 1);
            if (vowels.indexOf(letter) >= 0)
               numVowels++;
         }
      }
      System.out.println(numVowels);
   }
}
