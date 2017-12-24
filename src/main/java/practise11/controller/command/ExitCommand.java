package practise11.controller.command;

import practise11.view.View;

public class ExitCommand implements Command {
    @Override
    public void execute(View view) {
        view.showMessage("Exit");
        System.exit(0);
    }
}
