package week5;

import java.util.Scanner;

public class CrossCountry {
   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      processRunner(in);
      // processRunner(in);
      // processRunner(in);

   }

   private static void processRunner(Scanner in) {
      String firstName, lastName;
      String mileOne, mileTwo, finish;
      String splitTwo, splitThree;

      // prompt user name
      // get MileOne time
      // get MileTwo time
      // get finish time

      // get Split Two
      splitTwo = subtractTimes(mileTwo, mileOne);

      // get Split Three
      splitThree = subtractTimes(finish, mileTwo);

      displayInfo(firstName, lastName, mileOne, splitTwo, splitThree, finish);

   }

   private static void displayInfo(String firstName, String lastName, String mileOne, String splitTwo,
         String splitThree, String finish) {
   }

   private static String subtractTimes(String time2, String time1) {
      double time2InSeconds = convertToSeconds(time2);
      double time1InSeconds = convertToSeconds(time1);

      // getDifference and then build a new Time

   }

   private static double convertToSeconds(String time) {
      int minutes = getMinutes(time);
      double seconds = getSeconds(time);
   }
}
