public class Deck {
    public static void main(String[] args) {
        String[] suits = { "❤", "♦", "♣", "♠" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
    
        String[] deck = new String[suits.length * ranks.length];
    
        // nested loops to create the deck of cards
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {
                deck[i + 13*j] = ranks[i] + suits[j];
            }
        }
    
        // print the deck of cards
        for (int i = 0; i < deck.length; i++)
        {
            System.out.print(deck[i] + " ");
        }
        System.out.println();
    }
}
