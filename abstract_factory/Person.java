package abstract_factory;

public interface Person {
    public abstract void wearClothes(ClothesFactory clothesFactory);
    public abstract void flexClothes();
    public abstract String toString();
}
