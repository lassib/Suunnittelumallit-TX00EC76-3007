package composite;

public class HDD implements ComputerPart{

    private int price;

    public HDD(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
