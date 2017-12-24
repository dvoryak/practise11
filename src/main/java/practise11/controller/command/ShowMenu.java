package practise11.controller.command;

import practise11.view.View;
import practise11.view.constant.Constant;

import static practise11.view.constant.Constant.*;


public class ShowMenu implements Command {

    @Override
    public void execute(View view) {
        view.showMessage(MenuConstant.GET_ALL_EMPLOYEES);
        view.showMessage(MenuConstant.GET_ALL_TASKS);
        view.showMessage(MenuConstant.GET_ALL_EMPLOYEES_BY_DEPARTMENT);
        view.showMessage(MenuConstant.ADD_TASK);
        view.showMessage(MenuConstant.GET_ALL_TASKS_BY_EMPLOYEE);
        view.showMessage(MenuConstant.REMOVE_EMPLOYEE);
        view.showMessage(MenuConstant.EXIT);
        view.showMessage("");
    }
}
