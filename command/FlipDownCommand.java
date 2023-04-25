package command;

public class FlipDownCommand implements ICommand {

    private final Screen screen;

    public FlipDownCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.pullDown();
    }
}
