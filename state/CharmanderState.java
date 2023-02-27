package state;

public class CharmanderState extends State{

    CharmanderState() {
        System.out.println("Charmander is born");
    }

    @Override
    public void attack() {
        System.out.println("Charmander attacks");
    }

    @Override
    public void defend() {
        System.out.println("Charmander defends");
    }

    @Override
    public void run() {
        System.out.println("Charmander runs");
    }

}
