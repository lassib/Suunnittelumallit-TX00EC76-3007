package observer_with_api;

import java.util.Observable;

public class ClockTimer extends Observable implements Runnable{

    private int hour;
    private int minute;
    private int second;

    public ClockTimer() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public void run() {
        while(true){
            if (second == 60) {
                second = 0;
                minute++;
                if (minute == 60) {
                    minute = 0;
                    hour++;
                    if (hour == 24) {
                        hour = 0;
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            second++;
            setChanged();
            notifyObservers(this);
        }
    }
}
