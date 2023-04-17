package protorypeShallow;

public class Clock implements Cloneable {
    private final Hand hour;
    private final Hand minute;
    private final Hand second;

    public Clock(Hand hour, Hand minute, Hand second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void tick() {
        second.tick();
        if (second.getValue() == 0) {
            minute.tick();
            if (minute.getValue() == 0) {
                hour.tick();
            }
        }
    }

    public void display() {
        System.out.println(hour.getValue() + ":" + minute.getValue() + ":" + second.getValue());
    }

    public Clock clone() {
        try {
            return (Clock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
