package abstract_factory;

public class Main {
    
    public static void main(String[] args) {
        Person jasper = new Jasper();
        ClothesFactory clothesFactory = new AdidasFactory();
        jasper.wearClothes(clothesFactory);
        System.out.println(jasper);

        clothesFactory = new BossFactory();
        jasper.wearClothes(clothesFactory);
        System.out.println(jasper);
    }
}
