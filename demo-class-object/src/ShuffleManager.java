import java.util.List;

public class ShuffleManager { // PaymentService
    private List<Card> cards;

    // Dependency Injection
    public ShuffleManager(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {

    }
}
