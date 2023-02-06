package singleton;

public class Main {
    
    public static void main(String[] args) {
        DBConnector instance = DBConnector.getInstance();
        instance.connect();
        instance.disconnect();
    }
}
