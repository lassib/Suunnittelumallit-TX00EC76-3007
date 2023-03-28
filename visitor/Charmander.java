package visitor;

public class Charmander implements IPokemonState {

    public Charmander() {
        System.out.println("Charmander is born!");
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Charmander attacks!");
        pokemon.setXp(pokemon.getXp() + 1);
    }

    @Override
    public void heal(Pokemon pokemon) {
        System.out.println("Charmander heals!");
    }

    @Override
    public void block(Pokemon pokemon) {
        System.out.println("Charmander blocks!");
    }

    @Override
    public void accept(EvolutionVisitor visitor) {
        visitor.visit(this);
    }
}
