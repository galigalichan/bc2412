public enum Suits {
    SPADES('S'),
    HEARTS('H'),
    CLUBS('C'),
    DIAMONDS('D'),
    ;

    private final char abbr;

    private Suits(char abbr) {
        this.abbr = abbr;
    }

    public char getAbbr() {
        return this.abbr;
    }
}
