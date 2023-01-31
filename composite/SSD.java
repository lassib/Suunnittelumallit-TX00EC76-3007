package composite;

public class SSD implements ComputerPart{
        
        private int price;
        
        public SSD(int price) {
            this.price = price;
        }
        
        public int getPrice() {
            return price;
        }
}
