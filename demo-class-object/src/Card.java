public class Card {
    // static: shared values
    // final: cannot be modified after initialization
    // static and final can be together
    // "static final" -> constant
    // Constant naming convention
    public static final char[] SUITS = new char[] {'S', 'H', 'C', 'D'}; // static so that the array won't be created again when called
    public static final Rank[] RANKS = new Rank[] {Rank.ACE, Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING};

    public static final int x = 3;

    // String (more than one char) vs char (Single character)
    private Rank rank; // 'A', '2', '3', '4', 'K'
    private char suit; // 'D', 'C', 'H', 'S'

    public Card(Rank rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }
    

    public Rank getRank() {
        return this.rank;
    }

    public char getSuit() {
        return this.suit;
    }

    public boolean isSameRank(Card card) {
        return this.rank == card.getRank();
    }

    public static void main(String[] args) {
        

    }

}
