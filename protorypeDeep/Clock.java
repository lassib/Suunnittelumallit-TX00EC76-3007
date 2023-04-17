package protorypeDeep;

public class Clock implements Cloneable {
    private Hand hour;
    private Hand minute;
    private Hand second;

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
            Clock clock = (Clock) super.clone();
            clock.hour = hour.clone();
            clock.minute = minute.clone();
            clock.second = second.clone();
            return clock;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
