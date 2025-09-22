/**
 * Takes two integer inputs and outputs their sum, product, quotient, and remainder.
 */
public class IntOps 
{
  public static void main(String[] args)
  {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int sum = a + b;
    int prod = a * b;
    int quot = a / b;
    int rem = a % b;

    System.out.println(a + " + " + b + " = " + sum);
    System.out.println(a + " * " + b + " = " + prod);
    System.out.println(a + " / " + b + " = " + quot);
    System.out.println(a + " % " + b + " = " + rem);
  }
}


/**
 * Exercises:
 *   1. What would you expect to get for the quotient 
 *      if a is not evenly divisible by b? What do you actually get? Why?
 *   2. Add code to compute and display the difference of a and b.
 */
