package abstract_factory;

public class Jasper implements Person{
    
    private String pants;
    private String shirt;
    private String shoes;
    private String cap;

    public Jasper() {
    }

    @Override
    public void wearClothes(ClothesFactory clothesFactory) {
        pants = clothesFactory.createPants().toString();
        shirt = clothesFactory.createShirt().toString();
        shoes = clothesFactory.createShoes().toString();
        cap = clothesFactory.createCap().toString();
    }

    @Override
    public String toString() {
        return "Jasper is wearing: " + pants + ", " + shirt + ", " + shoes + ", " + cap + ".";
    }
}
