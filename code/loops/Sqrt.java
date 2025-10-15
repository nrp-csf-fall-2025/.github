/**
 * Implements the Newton-Raphson method to compute the square root of a number.
 */
public class Sqrt
{
  public static void main(String[] args)
  {
    double EPSILON = 1E-15;
    double c = Double.parseDouble(args[0]);

    int iterCount = 0;

    // t is our guess; use c as initial guess
    double t = c / 2;

    // continue updating until guess is within EPSILON
    while (Math.abs(t - c / t) > EPSILON * t)
    {
      // update guess
      t = (c / t + t) / 2.0;

      iterCount++;
      System.out.println("Iteration " + iterCount + ": t = " + t);
    }

    System.out.println(t);
  }
}
