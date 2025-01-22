package furniture;

public class VictorianChair extends Chair {
  @Override
  public boolean hasLegs() {
    return true;
  }

  @Override
  public boolean sitOn() {
    return true;
  }
}