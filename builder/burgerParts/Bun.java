package builder.burgerParts;

public class Bun {

    private final String type;

    public Bun(String type) {
        this.type = type;
        System.out.println(type + " bun added");
    }

    public String toString() {
        return type + " bun";
    }
}
