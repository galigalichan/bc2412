package factory;

import furniture.Chair;
import furniture.Sofa;

public interface FurnitureFactory {
  Chair createChair();
  Sofa createSofa();

  public static FurnitureFactory createFactory(Furniture.Style style) {
    return switch (style) {
      case MODERN -> {
        yield new ModernFurnitureFactory();
      }
      case VICTORIAN -> {
        yield new VictorianFurnitureFactory();
      }
    };
  }
}