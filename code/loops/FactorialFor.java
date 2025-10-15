public class FactorialFor
{
  public static void main(String[] args) 
  {
    int n = Integer.parseInt(args[0]);
    int v = 1;

    for (int i = 0; i <= n; i = i + 1)
    {
      v *= i;
    }

    System.out.println(v);
  }
}
