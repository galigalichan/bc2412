public class Card {
    // static: shared values
    // final: cannot be modified after initialization
    // static and final can be together
    // "static final" -> constant
    // Constant naming convention
    public static final char[] SUITS = new char[] {'S', 'H', 'C', 'D'}; // static so that the array won't be created again when called
    public static final char[] RANKS = new char[] {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};

    public static final int x = 3;

    // String (more than one char) vs char (Single character)
    private char rank; // 'A', '2', '3', '4', 'K'
    private char suit; // 'D', 'C', 'H', 'S'

    public Card(char rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }
    

    public char getRank() {
        return this.rank;
    }

    public char getSuite() {
        return this.suit;
    }

    public static void main(String[] args) {
        

    }

}
