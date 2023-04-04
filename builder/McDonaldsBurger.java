package builder;

import java.util.List;

public class McDonaldsBurger {

    protected List<Object> burgerParts;

    public McDonaldsBurger(List<Object> burgerParts) {
        this.burgerParts = burgerParts;
    }

    public McDonaldsBurger() {
    }

    public String toString() {
        String burger = "McDonalds burger with: ";
        for (Object burgerPart : burgerParts) {
            burger += burgerPart.toString() + ", ";
        }
        return burger;
    }

}
