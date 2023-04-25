package command;

public class WallButton {

    private final ICommand command;

    public WallButton(ICommand command) {
        this.command = command;
    }

    public void push() {
        command.execute();
    }
}
