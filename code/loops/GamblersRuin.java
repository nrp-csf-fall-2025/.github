public class GamblersRuin 
{
  public static void main(String[] args)
  {
    int goal = Integer.parseInt(args[1]);
    int bet = Integer.parseInt(args[2]);
    int trials = Integer.parseInt(args[3]);

    int numBets = 0;
    int wins = 0;

    for (int t = 0; t < trials; t++) 
    {
      // reset stake for each trial
      stake = Integer.parseInt(args[0]);
      
      // play until player goes brok or reaches goal
      while (stake > 0 && stake < goal)
      {
        numBets++;
        if (Math.random() >= 0.5) stake += bet;
        else                      stake -= bet;
      }

      if (stake >= goal) wins++; 
    }

    System.out.println(wins + " wins out of " + trials);
    System.out.println(100.0 * wins / trials + "% wins");
    System.out.println("Avg # bets: " + 1.0 * numBets / trials);
  }
}
