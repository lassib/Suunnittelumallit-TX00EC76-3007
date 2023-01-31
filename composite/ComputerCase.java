package composite;

public class ComputerCase implements ComputerPart{
    
    private int price;
    
    public ComputerCase(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
}
