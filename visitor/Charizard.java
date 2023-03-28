package visitor;

public class Charizard implements IPokemonState {

    public Charizard() {
        System.out.println("Charizard is born!");
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Charizard attacks!");
        pokemon.setXp(pokemon.getXp() + 1);
    }

    @Override
    public void heal(Pokemon pokemon) {
        System.out.println("Charizard heals!");
    }

    @Override
    public void block(Pokemon pokemon) {
        System.out.println("Charizard blocks!");
    }

    @Override
    public void accept(EvolutionVisitor visitor) {
        visitor.visit(this);
    }
}
