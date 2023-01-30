package abstract_factory;

public class Shirt {
    private String brand;

    public Shirt(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Shirt made by " + brand;
    }
}
