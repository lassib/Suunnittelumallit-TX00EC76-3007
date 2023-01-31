package composite;

public class SSD implements ComputerPart{
    
    private String name;
    private double price;      

    public SSD(String name, double price) {
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
        return "SSD name: " + name + ", Price: " + price;
    }
}
