package command;

public class Main {

    public static void main(String[] args) {
        Screen screen = new Screen();
        ICommand flipUpCommand = new FlipUpCommand(screen);
        ICommand flipDownCommand = new FlipDownCommand(screen);

        WallButton button1 = new WallButton(flipUpCommand);
        WallButton button2 = new WallButton(flipDownCommand);

        button1.push();
        button2.push();
    }
}
