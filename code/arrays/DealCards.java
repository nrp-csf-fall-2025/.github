/**
 * Builds a standard 52 card deck and deals N random cards. 
 * Randomization accomplished via a shuffling algorithm.
 * 
 * Alternate implementation:
 *  - generate a random number between 0 and 51
 *    - if the card at that index has not already been dealt:
 *      - deal it
 *      - update `deck` to mark that card as dealt
 *    - if the card at that index has already been dealt, generate a new random number
 *  - repeat until N cards have been dealt
 */
public class DealCards 
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]); // number of cards to deal

        String[] suits = { "❤", "♦", "♣", "♠" };
        String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    
        String[] deck = new String[suits.length * ranks.length];
    
        // Nested loops to create the deck of cards
        for (int i = 0; i < suits.length; i++)
        {
            for (int j = 0; j < ranks.length; j++)
            {
                deck[i * ranks.length + j] = ranks[j] + suits[i];
            }
        }

        // shuffle the deck
        for (int i = 0; i < deck.length; i++)
        {
            int r = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        for (int i = 0; i < N; i++)
        {
            System.out.print(deck[i] + " ");
        }
        System.out.println();
    }
}
