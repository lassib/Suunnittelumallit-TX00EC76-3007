package abstract_factory;

public class Pants {
    private String brand;

    public Pants(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Pants made by " + brand;
    }
}
