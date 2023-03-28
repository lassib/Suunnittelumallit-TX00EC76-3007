package visitor;

public interface IPokemonState {
    void attack(Pokemon pokemon);

    void heal(Pokemon pokemon);

    void block(Pokemon pokemon);

    void accept(EvolutionVisitor visitor);
}
