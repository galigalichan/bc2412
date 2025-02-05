public class BigTwoGame {
    private Deck deck;
    private ShuffleManager shuffleManager;
    private final Player[] players = new Player[4]; // finalize the array so that only 4 players can participate each time

    // new BigTwoGame
    {
    this.players[0] = new Player(1);
    this.players[1] = new Player(2);
    this.players[2] = new Player(3);
    this.players[3] = new Player(4);
    }

    public BigTwoGame() {
        this.deck = new Deck();
        this.shuffleManager = new ShuffleManager(this.deck.getCards());
    }

    public void start() {
        this.shuffleManager.shuffle();
    }
}
