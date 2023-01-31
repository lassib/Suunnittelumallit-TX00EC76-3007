package composite;

public class Motherboard implements ComputerPart{

    private int price;
    
    public Motherboard(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
}
