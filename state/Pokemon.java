package state;

public class Pokemon {

    private State state;

    public Pokemon() {
        this.state = new CharmanderState();
    }

    public void evolve() {
        if (state instanceof CharmanderState) {
            state.changeState(this, new CharmeleonState());
        } else if (state instanceof CharmeleonState) {
            state.changeState(this, new CharizardState());
        } else {
            System.out.println("Pokemon is already at max evolution");
        }
    }

    public void attack() {
        state.attack();
    }

    public void defend() {
        state.defend();
    }

    public void run() {
        state.run();
    }

    public void setState(State state) {
        this.state = state;
    }

}
