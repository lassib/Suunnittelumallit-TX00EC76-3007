package protorypeDeep;

public class Hand implements Cloneable {
    private int value;
    private final int limit;

    public Hand(int value, int limit) {
        this.value = value;
        this.limit = limit;
    }

    public void tick() {
        value = (value + 1) % limit;
    }

    public int getValue() {
        return value;
    }

    public Hand clone() {
        try {
            return (Hand) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

}
