package decorator;

import java.util.Scanner;

public class Decorator extends DataProtection{

    Scanner scanner = new Scanner(System.in);

    public Decorator(IDataAccess dataAccess) {
        super(dataAccess);
    }

    @Override
    public IDataAccess readData() {
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        if (password.equals("1234")) {
            return super.readData();
        }
        System.out.println("Wrong password");
        return null;
    }
}
