package composite;

public class NetwordCard implements ComputerPart{
    
    private int price;
    
    public NetwordCard(int price) {
        this.price = price;
    }
    
    @Override
    public int getPrice() {
        return price;
    }
}
