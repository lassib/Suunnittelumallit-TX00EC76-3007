package visitor;

public class Charmeleon implements IPokemonState {

    public Charmeleon() {
        System.out.println("Charmeleon is born!");
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Charmeleon attacks!");
        pokemon.setXp(pokemon.getXp() + 1);
    }

    @Override
    public void heal(Pokemon pokemon) {
        System.out.println("Charmeleon heals!");
    }

    @Override
    public void block(Pokemon pokemon) {
        System.out.println("Charmeleon blocks!");
    }

    @Override
    public void accept(EvolutionVisitor visitor) {
        visitor.visit(this);
    }
}
