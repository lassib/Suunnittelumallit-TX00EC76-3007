package observer_with_api;

public class Main {

    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        DigitalClock clock1 = new DigitalClock(timer);
        DigitalClock clock2 = new DigitalClock(timer);
        DigitalClock clock3 = new DigitalClock(timer);

        timer.addObserver(clock1);
        timer.addObserver(clock2);
        timer.addObserver(clock3);
        
        timer.run();

        timer.deleteObserver(clock1);

        timer.run();

        timer.deleteObserver(clock2);

        for (int i = 0; i < 60; i++) {
            timer.run();
        }
    }
}
