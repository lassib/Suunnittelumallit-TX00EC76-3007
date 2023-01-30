package abstract_factory;

public interface ClothesFactory {
    public abstract Pants createPants();
    public abstract Shirt createShirt();
    public abstract Cap createCap();
    public abstract Shoes createShoes();
}
