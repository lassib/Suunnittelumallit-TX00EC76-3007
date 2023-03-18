package chain_of_responsibility;

public abstract class RaisePower {

    protected static final int BASE = 1;
    private RaisePower successor;

    public void setSuccessor(RaisePower successor) {
        this.successor = successor;
    }

    public void processRequest(RaiseRequest request) {
        if (successor != null) {
            successor.processRequest(request);
        }
    }
}
