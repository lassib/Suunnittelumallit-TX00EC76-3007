package builder.burgerParts;

public class Patty {

    private final String type;

    public Patty(String type) {
        this.type = type;
        System.out.println(type + " patty added");
    }

    public String toString() {
        return type + " patty";
    }
}
