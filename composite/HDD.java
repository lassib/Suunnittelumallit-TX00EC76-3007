package composite;

public class HDD implements ComputerPart{

    private String name;
    private double price;

    public HDD(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "HDD name: " + name + ", Price: " + price;
    }
}
