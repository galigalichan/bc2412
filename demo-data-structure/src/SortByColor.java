import java.util.Comparator;

public class SortByColor implements Comparator<Ball> {
    @Override
    public int compare(Ball b1, Ball b2) {
    if (b1.getColor() == Ball.Color.RED)
        return 1;
    if (b1.getColor() == Ball.Color.BLUE && b2.getColor() == Ball.Color.RED)
        return 1;
    if (b1.getColor() == Ball.Color.BLUE && b2.getColor() == Ball.Color.YELLOW)
        return -1;
    if (b1.getColor() == Ball.Color.YELLOW)
        return 1;
    if (b1.getColor() == Ball.Color.YELLOW)
        return -1;
        return 0;
    }
    
}
