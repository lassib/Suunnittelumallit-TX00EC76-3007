package composite;

public class Prosessor implements ComputerPart{
    
    private String name;
    private double price;
    
    public Prosessor(String name, double price) {
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
        return "Processor name: " + name + ", Price: " + price;
    }
}
