package state;

public class CharizardState extends State{

    CharizardState() {
        System.out.println("Charmeleon evolves into Charizard");
    }

    @Override
    public void attack() {
        System.out.println("Charizard attacks");
    }

    @Override
    public void defend() {
        System.out.println("Charizard defends");
    }

    @Override
    public void run() {
        System.out.println("Charizard runs");
    }

}
