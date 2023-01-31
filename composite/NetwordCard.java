package composite;

public class NetwordCard implements ComputerPart{
    
    private String name;
    private double price;
    
    public NetwordCard(String name, double price) {
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
        return "Network card name: " + name + ", Price: " + price;
    }
}
