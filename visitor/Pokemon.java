package visitor;

public class Pokemon {
    private IPokemonState state;
    private int xp;

    public Pokemon() {
        this.state = new Charmander();
        this.xp = 0;
    }

    public void attack() {
        this.state.attack(this);
    }

    public void heal() {
        this.state.heal(this);
    }

    public void block() {
        this.state.block(this);
    }

    public void setState(IPokemonState state) {
        this.state = state;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
        state.accept(new EvolutionVisitor(this));
    }
}
