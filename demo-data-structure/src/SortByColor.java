import java.util.Comparator;

// Sort: RED -> BLUE -> YELLOW
public class SortByColor implements Comparator<Ball1> {
  @Override
  public int compare(Ball1 b1, Ball1 b2) {
    // b1 (-1), b2 (1)
    if (b1.getColor() == Ball1.Color.RED)
      return -1;
    if (b2.getColor() == Ball1.Color.RED)
      return 1;
    if (b1.getColor() == Ball1.Color.BLUE)
      return -1;
    return 1;
  }
}