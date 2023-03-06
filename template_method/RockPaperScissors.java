package template_method;

import java.util.Scanner;

public class RockPaperScissors extends Game {

    boolean gameRunning = true;
    int player;
    Scanner scanner = new Scanner(System.in);

    @Override
    void initializeGame() {

    }

    @Override
    void makePlay(int player) {
        boolean choosing = true;
        String choice = "";
        this.player = player + 1;

        while (choosing) {
            System.out.println("Player " + this.player + " choose rock, paper or scissors");
            choice = scanner.nextLine();
            if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
                choosing = false;
            }
        }
        int computerChoice = (int) (Math.random() * 3);
        if (computerChoice == 0) {
            System.out.println("Computer chose rock");
            if (choice.equals("rock")) {
                System.out.println("Player " + this.player + " draw! Change of turn.");
            } else if (choice.equals("paper")) {
                gameRunning = false;
            } else {
                System.out.println("Player " + this.player + " lost! Change of turn.");
            }
        } else if (computerChoice == 1) {
            System.out.println("Computer chose paper");
            if (choice.equals("rock")) {
                System.out.println("Player " + this.player + " lost! Change of turn.");
            } else if (choice.equals("paper")) {
                System.out.println("Player " + this.player + " draw! Change of turn.");
            } else {
                gameRunning = false;
            }
        } else {
            System.out.println("Computer chose scissors");
            if (choice.equals("rock")) {
                gameRunning = false;
            } else if (choice.equals("paper")) {
                System.out.println("Player " + this.player + " lost! Change of turn.");
            } else {
                System.out.println("Player " + this.player + " draw! Change of turn.");
            }
        }
    }

    @Override
    boolean endOfGame() {
        return !gameRunning;
    }

    @Override
    void printWinner() {
        System.out.println("Game over. Player " + player + " won!");
    }
}
