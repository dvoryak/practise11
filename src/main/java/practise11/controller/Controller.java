package practise11.controller;

import practise11.controller.command.CommandExecutor;
import practise11.controller.command.Type;
import practise11.util.ConsoleHelper;
import practise11.view.View;

public class Controller {

    private View view;
    private CommandExecutor commandExecutor = CommandExecutor.INSTANCE;

    public Controller(View view) {
        this.view = view;
    }

    public void run() {
        while(true) {
            commandExecutor.execute(Type.SHOW_MENU,view);
            commandExecutor.execute(Type.values()[ConsoleHelper.readInt()],view);
        }
    }
}
