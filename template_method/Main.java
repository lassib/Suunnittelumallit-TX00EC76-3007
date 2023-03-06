package template_method;

public class Main {
    public static void main(String[] args) {
        Game game = new RockPaperScissors();
        game.playOneGame(3);
    }
}
