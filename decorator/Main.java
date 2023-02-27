package decorator;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        Map<String, String> unsecuredData = new HashMap<>();
        Map<String, String> securedData = new HashMap<>();

        unsecuredData.put("1", "One");
        unsecuredData.put("2", "Two");
        securedData.put("3", "Three");
        securedData.put("4", "Four");


        IDataAccess unsecuredDataStructure = new DataStructure(unsecuredData);
        IDataAccess securedDataStructure = new Decorator(new DataStructure(securedData));

        System.out.println("Unsecured data: " + unsecuredDataStructure.readData());
        System.out.println("Secured data: " + securedDataStructure.readData());
    }
}
