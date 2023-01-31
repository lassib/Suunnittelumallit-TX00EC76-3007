package composite;

public class GraphicsCard implements ComputerPart{
    
    private String name;
    private double price;
    
    public GraphicsCard(String name, double price) {
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
        return "GPU name: " + name + ", Price: " + price;
    }
}
