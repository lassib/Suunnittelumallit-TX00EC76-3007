package composite;

import java.util.ArrayList;
import java.util.List;

public class Motherboard implements ComputerPart{

    private String name;
    private double price;
    private List<ComputerPart> parts = new ArrayList<>();
    
    public Motherboard(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    public double getPrice() {
        for (ComputerPart part : parts) {
            price += part.getPrice();
        }
        return price;
    }

    public void addComputerPart(ComputerPart part) {
        parts.add(part);
    }

    public void removeComputerPart(ComputerPart part) {
        parts.remove(part);
    }

    @Override
    public String toString() {
        for (ComputerPart part : parts) {
            System.out.println(part);
        }
        return "Motherboard name: " + name + ", Price: " + price;
    }
}
