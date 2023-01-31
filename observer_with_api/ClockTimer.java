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

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
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
        second++;
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
        setChanged();
        notifyObservers();
    }
}
