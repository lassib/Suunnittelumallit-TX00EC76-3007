package state;

public class CharmeleonState extends State{

    CharmeleonState() {
        System.out.println("Charmander evolves into Charmeleon");
    }

    @Override
    public void attack() {
        System.out.println("Charmeleon attacks");
    }

    @Override
    public void defend() {
        System.out.println("Charmeleon defends");
    }

    @Override
    public void run() {
        System.out.println("Charmeleon runs");
    }

}
