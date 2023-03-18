package memento;

public class Main {

    public static void main(String[] args) {
        Riddler riddler = new Riddler();

        System.out.println("Starting game...");
        System.out.println("Players are joining the game...");
        Player player1 = new Player("Player 1", riddler);
        Player player2 = new Player("Player 2", riddler);
        Player player3 = new Player("Player 3", riddler);

        System.out.println("Players are guessing the number...");

        Thread thread1 = new Thread(player1);
        Thread thread2 = new Thread(player2);
        Thread thread3 = new Thread(player3);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println();
        System.out.println("Game over! All players have guessed the number!");
    }
}
