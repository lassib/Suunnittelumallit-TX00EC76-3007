package observer;

public class DigitalClock implements Observer{

    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        timer.attach(this);
    }

    @Override
    public void update(Subject theChangedSubject) {
        if (theChangedSubject == timer) {
            draw();
        }
    }

    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        System.out.println("DigitalClock: " + hour + ":" + minute + ":" + second);
    }
}
