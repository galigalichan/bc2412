import java.util.Comparator;

public class SortByValue implements Comparator<Ball1> {
    @Override
    public int compare(Ball1 b1, Ball1 b2) {
        return b1.getValue() > b2.getValue() ? -1 : 1;
    }
}
