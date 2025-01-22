package furniture;

public class ArtDecoChair extends Chair {
    @Override
    public boolean hasLegs() {
      return true;
    }
  
    @Override
    public boolean sitOn() {
      return true;
    }
}
