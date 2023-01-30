package abstract_factory;

public class Cap {
    private String brand;

    public Cap(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Cap made by " + brand;
    }
    
}
