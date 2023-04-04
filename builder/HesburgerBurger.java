package builder;

public class HesburgerBurger {

    private StringBuilder burgerParts;

    public HesburgerBurger(StringBuilder burgerParts) {
        this.burgerParts = burgerParts;
    }

    public HesburgerBurger() {
    }

    public String toString() {
        String burger = "Hesburger burger with: ";
        burger += burgerParts.toString();
        return burger;
    }
}
