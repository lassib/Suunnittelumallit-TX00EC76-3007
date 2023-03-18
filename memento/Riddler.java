package memento;

public class Riddler {

    public Memento joinGame() {
        int number = (int) (Math.random() * 50) + 1;
        return new Memento(number);
    }

    public boolean guess(Memento memento, int guess) {
        return memento.getNumber() == guess;
    }

    public static class Memento {
        private final int number;

        private Memento(int number) {
            this.number = number;
        }

        private int getNumber() {
            return number;
        }
    }
}
