package composite;

public class RAM implements ComputerPart{
    
    private String name;
    private double price;
    
    public RAM(String name, double price) {
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
        return "Ram name: " + name + ", Price: " + price;
    }
}
