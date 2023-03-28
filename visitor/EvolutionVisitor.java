package visitor;

public class EvolutionVisitor implements Visitor {
    private final Pokemon pokemon;

    public EvolutionVisitor(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void visit(Charmander charmander) {
        System.out.println("Charmander is evolving!");
        if (pokemon.getXp() >= 3) {
            pokemon.setState(new Charmeleon());
        }
    }

    @Override
    public void visit(Charmeleon charmeleon) {
        System.out.println("Charmeleon is evolving!");
        if (pokemon.getXp() >= 6) {
            pokemon.setState(new Charizard());
        }
    }

    @Override
    public void visit(Charizard charizard) {
        System.out.println("Charizard has reached its final form!");
    }
}
