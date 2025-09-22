/*
 * A simple program to demonstrate exchanging the values of two variables.
 * A `temp` variable is used to hold one of the values during the exchange.
 *
 * Note that when `a`, `b`, and `temp` are declared, their type (`int`) is specified;
 * when they are assigned new values, the type is not specified again.
 */
public class Exchange 
{
  public static void main(String[] args) 
  {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int temp = a; // temp gets the *value* stored at a, not the string "a"

    a = b;
    b = temp;

    System.out.println("a: ", a);
    System.out.println("b: ", b);
  }
}

