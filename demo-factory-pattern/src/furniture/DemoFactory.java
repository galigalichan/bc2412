package furniture;

import factory.FurnitureFactory;

public class DemoFactory {
  public static void main(String[] args) {
    FurnitureFactory factory = FurnitureFactory.createFactory(Furniture.Style.MODERN);
    
    // decouple
    Chair chair = factory.createChair();
    System.out.println(chair.hasLegs());
    System.out.println(chair.sitOn());
    
    // Runtime Polymorphism
    // Chair mc = new ModernChair();
    // Chair vc = new VictorianChair();
    // System.out.println(mc.sitOn());
    // System.out.println(mc.hasLegs());
    // System.out.println(vc.hasLegs());
    // System.out.println(vc.sitOn());
  }
}