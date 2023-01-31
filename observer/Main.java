package observer;

public class Main {

    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        DigitalClock clock1 = new DigitalClock(timer);
        DigitalClock clock2 = new DigitalClock(timer);
        DigitalClock clock3 = new DigitalClock(timer);
        
        timer.attach(clock1);
        timer.attach(clock2);
        timer.attach(clock3);

        timer.tick();

        timer.detach(clock1);

        timer.tick();

        timer.detach(clock2);

        for (int i = 0; i < 60; i++) {
            timer.tick();
        }
    }
}
