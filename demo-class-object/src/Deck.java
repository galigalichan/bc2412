import java.util.Arrays;
import java.util.List;

public class Deck {
    // 52 cards
    private Card[] cards;


    // constructor: needs to run from beginning to end to create objects.
    public Deck() {
        this.cards = new Card[Card.SUITS.length * Card.RANKS.length]; // 13 * 4
        int idx = 0;
        for (Rank rank : Card.RANKS) {
            for (char suite : Card.SUITS) {
                this.cards[idx++] = new Card(rank, suite);
            }
        }
    }

    public List<Card> getCards() {
        return Arrays.asList(this.cards);
    }

    public static void main(String[] args) {
        Deck deck = new Deck(); // 52 cards (fixed)
        
        System.out.println(Math.PI); // public & static
        // Math.PI: public static (no need to "new") final
        Card card = new Card(Rank.ACE,'S');
        Card card2 = new Card(Rank.ACE,'S');

        if(card.equals(new Card(Rank.ACE,'S'))) {
        
        }

        // Card.x = 10;
        // Card.suites = new char[3];
        // Card c1 = new Card('A', 'D');



    }

}
