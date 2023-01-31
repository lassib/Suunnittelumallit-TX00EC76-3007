package composite;

public class RAM implements ComputerPart{
    
    private int price;
    
    public RAM(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
}
