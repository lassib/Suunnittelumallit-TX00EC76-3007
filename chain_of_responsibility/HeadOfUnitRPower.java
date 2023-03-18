package chain_of_responsibility;

public class HeadOfUnitRPower extends RaisePower {

    private static final int ALLOWABLE = 5 * BASE;

    public void processRequest(RaiseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Raise request of " + request.getAmount() + "% for reason: " + request.getPurpose() + ", has been forwarded to the head of unit");
        } else {
            System.out.println("Raise request of " + request.getAmount() + "% for reason: " + request.getPurpose() + ", has been forwarded to the managing director");
        }
    }
}
