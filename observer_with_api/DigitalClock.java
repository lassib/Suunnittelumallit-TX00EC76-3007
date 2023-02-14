package observer_with_api;

import java.util.Observable;
import java.util.Observer;
import java.util.Timer;

public class DigitalClock implements Observer{

    public DigitalClock() {
    }

    @Override
    public void update(Observable obj, Object arg) {
            draw((ClockTimer) obj);
    }

    private void draw(ClockTimer timer) {
        System.out.println("DigitalClock: " + timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond());
    }
}
