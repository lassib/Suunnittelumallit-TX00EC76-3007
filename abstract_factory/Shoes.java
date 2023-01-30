package abstract_factory;

public class Shoes {
    private String brand;

    public Shoes(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Shoes made by " + brand;
    }
}
