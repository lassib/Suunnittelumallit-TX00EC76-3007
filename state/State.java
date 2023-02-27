package state;

public abstract class State {

    public void changeState(Pokemon pokemon, State state) {
        pokemon.setState(state);
    }

    public abstract void attack();
    public abstract void defend();
    public abstract void run();

}
