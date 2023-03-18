package chain_of_responsibility;

public class RaiseRequest {
    private final double amount;
    private final String purpose;

    public RaiseRequest(double amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public String getPurpose() {
        return purpose;
    }

}
