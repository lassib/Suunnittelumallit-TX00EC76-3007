package composite;

public class Main {

    public static void main(String[] args) {
        
        ComputerCase computer = new ComputerCase("Cooler Master", 120);
        Motherboard motherboard = new Motherboard("Asus", 200);

        motherboard.addComputerPart(new Prosessor("Intel", 300));
        motherboard.addComputerPart(new RAM("Corsair", 120));
        motherboard.addComputerPart(new GraphicsCard("Nvidia", 400));
        motherboard.addComputerPart(new NetwordCard("TP-Link", 40));

        computer.addComputerPart(motherboard);
        computer.addComputerPart(new HDD("Seagate", 70));
        computer.addComputerPart(new SSD("Samsung", 100));

        System.out.println(computer);

        System.out.println("Total price: " + computer.getPrice());
    }
}
