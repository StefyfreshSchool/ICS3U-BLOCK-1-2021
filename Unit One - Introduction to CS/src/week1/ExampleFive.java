package week1;

/**
 * More of the same. Assignment/Variables and Primitives
 */
public class ExampleFive {
  public static void main(String[] args) {
    int x = 80, y, z; // declared 3 variables all on the same line (initialized x to be 80)

    y = 75;
    z = 87;

    double average = (x + y + z) / 3; // integer math if bother operands are integers -> returns 80
    average = (x + y + z) / 3.0; // double math if any of the operands are doubles -> returns 80.666667

    System.out.println(average);

    int min = 5;
    double sec = 3.33211;

    System.out.printf("%d:%06.3f", min, sec);
  }
}
