package chain_of_responsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        RaisePower supervisor = new SupervisorRPower();
        RaisePower headOfUnit = new HeadOfUnitRPower();

        supervisor.setSuccessor(headOfUnit);

        System.out.println("Entering empty amount will end program!");
        try {
            while (true) {
                System.out.println("Enter the amount of your raise request as percent: ");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                supervisor.processRequest(new RaiseRequest(d, "Need more money!"));
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
