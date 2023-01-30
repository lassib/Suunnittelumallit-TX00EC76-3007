package abstract_factory;

public class BossFactory implements ClothesFactory {
    
    public BossFactory() {
    }

    public Pants createPants() {
        return new Pants("Boss");
    }

    public Shirt createShirt() {
        return new Shirt("Boss");
    }

    public Cap createCap() {
        return new Cap("Boss");
    }

    public Shoes createShoes() {
        return new Shoes("Boss");
    }
}
