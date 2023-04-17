package protorypeDeep;

public class Main {

    public static void main(String[] args) {
        Hand hour = new Hand(12, 24);
        Hand minute = new Hand(0, 60);
        Hand second = minute.clone();
        Clock clock = new Clock(hour, minute, second);
        Clock clock2 = clock.clone();

        clock.tick();
        clock2.tick();

        System.out.print("Clock 1: ");
        clock.display();
        System.out.print("Clock 2: ");
        clock2.display();

        clock.tick();

        System.out.print("Clock 1: ");
        clock.display();
        System.out.print("Clock 2: ");
        clock2.display();

        for (int i = 0; i < 100; i++) {
            clock2.tick();
            System.out.print("Clock 2: ");
            clock2.display();
        }

        System.out.print("Clock 1: ");
        clock.display();
        System.out.print("Clock 2: ");
        clock2.display();

    }
}
