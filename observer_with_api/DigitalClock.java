package observer_with_api;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer{

    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
    }

    @Override
    public void update(Observable obj, Object arg) {
        if (obj == timer) {
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
