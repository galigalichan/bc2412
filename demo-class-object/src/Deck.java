import java.util.Arrays;

public class Deck {
    // 52 cards
    private Card[] cards;


    // constructor: needs to run from beginning to end to create objects.
    public Deck() {
        this.cards = new Card[Card.SUITS.length * Card.RANKS.length]; // 13 * 4
        int idx = 0;
        for (char rank : Card.RANKS) {
            for (char suite : Card.SUITS) {
                this.cards[idx++] = new Card(rank, suite);
            }
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck(); // 52 cards (fixed)
        
        System.out.println(Math.PI); // public & static
        // Math.PI: public static (no need to "new") final
        Card card = new Card('A','S');
        Card card2 = new Card('A','S');

        if(card.equals(new Card('A','S'))) {

        }

        // Card.x = 10;
        // Card.suites = new char[3];
        // Card c1 = new Card('A', 'D');



    }

}
