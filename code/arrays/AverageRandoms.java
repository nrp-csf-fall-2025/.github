public class AverageRandoms 
{
  public static void main(String[] args)  
  {
    int N = 1000;
    double[] randoms = new double[N];

    // generate the array of random numbers
    for (int i = 0; i < randoms.length; i++) 
    {
      randoms[i] = Math.random();
    }

    // sum the array of random numbers
    double sum = 0;
    for (int i = 0; i < randoms.length; i++) 
    {
      sum += randoms[i];
    }

    double average = sum / N;
    System.out.printf("Average: %.4f%n", average);


    // find the min and max values in the array of random numbers
    double highest = Double.NEGATIVE_INFINITY;
    double lowest = Double.POSITIVE_INFINITY;
    for (int i = 0; i < randoms.length; i++) 
    {
      if (randoms[i] > highest) 
      {
        highest = randoms[i];
      }
      if (randoms[i] < lowest) 
      {
        lowest = randoms[i];
      }
    }

    System.out.printf("Highest: %.4f%n", highest);
    System.out.printf("Lowest: %.4f%n", lowest);
  }
}
