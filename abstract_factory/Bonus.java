package abstract_factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Bonus {
    
    public static void main(String[] args) {
        Class c = null;
        ClothesFactory clothesFactory = null;
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("abstract_factory/factory.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            c = Class.forName(properties.getProperty("factory"));
            clothesFactory = (ClothesFactory) c.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person jasper = new Jasper();
        jasper.wearClothes(clothesFactory);
        jasper.flexClothes();
    }
}
