package memento;

public class Player implements Runnable {

    private final String name;
    private final Riddler riddler;
    private Riddler.Memento memento;

    public Player(String name, Riddler riddler) {
        this.name = name;
        this.riddler = riddler;
        joinGame();
    }

    public void run() {
        boolean guess = true;
        while (guess) {
            int guessInt = (int) (Math.random() * 50) + 1;
            if (riddler.guess(memento, guessInt)) {
                System.out.println(name + " guessed " + guessInt + " correctly!");
                guess = false;
            } else {
                System.out.println(name + " guessed " + guessInt + " incorrectly!");
            }
        }
    }

    public void joinGame() {
        memento = riddler.joinGame();
    }
}
