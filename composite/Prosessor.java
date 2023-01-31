package composite;

public class Prosessor implements ComputerPart{
    
    private int price;
    
    public Prosessor(int price) {
        this.price = price;
    }
    
    @Override
    public int getPrice() {
        return price;
    }
}
