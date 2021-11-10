package week8;

public class Die {
   // private can only be accessed inside the class.
   // other classes cannot access private attributes/methods/constructors directly.
   private int topSide;
   private int numSides;

   /*
    * Default/No-Argument constructor -
    * 
    * If you do not create a constructor then Java creates a Default/No-Argument
    * constructor for you that does nothing (stay tuned for Ch9). It happens at
    * compilation (you will not see it but it exists)
    */

   public Die() {
      numSides = 6;
      roll();
   }

   // this refers to THIS instance of the Die.
   // The Die that we are creating/ the die that called the method
   /**
    * If we have the following: Die die1 = new Die(); die1.roll(); this (inside the
    * class) would be die1
    * 
    */
   public Die(int numSides) {
      this.numSides = numSides;
      roll();
   }

   public void roll() {
      topSide = (int) (Math.random() * numSides) + 1;
      // this.topSide = (int) (Math.random() * this.numSides) + 1;
   }

   public int getTopSide() {
      return topSide;
   }

   public String toString() {
      return "" + topSide;
   }

   public boolean equals(Object obj) {

      if (obj == this)
         return true;

      if (obj instanceof Die) {
         return this.topSide == ((Die) obj).topSide;
      } else {
         return false;
      }
   }
}
