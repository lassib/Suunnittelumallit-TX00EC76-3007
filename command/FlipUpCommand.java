package command;

public class FlipUpCommand implements ICommand {

    private final Screen screen;

    public FlipUpCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.pullUp();
    }
}
