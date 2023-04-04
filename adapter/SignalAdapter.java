package adapter;

public class SignalAdapter implements AnalogSignal {

    private final Signal signal;

    public SignalAdapter(Signal signal) {
        this.signal = signal;
    }

    @Override
    public void displayAnalog() {
        signal.display();
    }
}
