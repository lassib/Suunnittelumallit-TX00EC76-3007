package singleton;

public class DBConnector {
    private static DBConnector instance = null;

    private DBConnector() {
    }

    public static DBConnector getInstance() {
        if (instance == null) {
            instance = new DBConnector();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to database");
    }

    public void disconnect() {
        System.out.println("Disconnected from database");
    }
}
