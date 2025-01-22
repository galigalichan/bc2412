import furniture.ArtDecoChair;
import furniture.ArtDecoSofa;

package factory;
public class ArtDecoFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        System.out.println("I have my own way to create Art Deco chair");
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("I have my own way to create Art Deco sofa");
        return new ArtDecoSofa();
    }
}
