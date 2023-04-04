package builder.burgerParts;

public class Cheese {

    private final String type;

    public Cheese(String type) {
        this.type = type;
        System.out.println(type + " cheese added");
    }

    public String toString() {
        return type + " cheese";
    }
}
