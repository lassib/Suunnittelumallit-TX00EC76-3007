package chain_of_responsibility;

public class SupervisorRPower extends RaisePower {

    private static final int ALLOWABLE = 2 * BASE;

    public void processRequest(RaiseRequest request) {
        if (request.getAmount() <= ALLOWABLE) {
            System.out.println("Raise request of " + request.getAmount() + "% for reason: " + request.getPurpose() + ", has been forwarded to the supervisor");
        } else {
            super.processRequest(request);
        }
    }
}
