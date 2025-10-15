public class FactorialWhile 
{
  public static void main(String[] args) 
  {
    int n = Integer.parseInt(args[0]);
    int i = 1;
    int v = 1;

    while (i <= n)
    {
      v *= i;
      i++;
    }

    System.out.println(v);
  }
}
