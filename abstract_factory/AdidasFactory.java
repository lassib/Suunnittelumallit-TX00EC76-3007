package abstract_factory;

public class AdidasFactory implements ClothesFactory{

    public AdidasFactory() {
    }

    public Pants createPants() {
        return new Pants("Adidas");
    }
    
    public Shirt createShirt() {
        return new Shirt("Adidas");
    }

    public Cap createCap() {
        return new Cap("Adidas");
    }

    public Shoes createShoes() {
        return new Shoes("Adidas");
    }
}