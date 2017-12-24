package practise11.controller.command;

import practise11.service.EmployeeService;
import practise11.util.ConsoleHelper;
import practise11.view.View;
import practise11.view.constant.Constant;

public class RemoveEmployeeCommand implements Command {

    private EmployeeService employeeService;

    public RemoveEmployeeCommand(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void execute(View view) {
        view.showMessage(Constant.InputConstant.EMPLOYEE_ID);
        if (employeeService.removeEmployee(ConsoleHelper.readInt()))
            view.showMessage(Constant.InputConstant.DELETE_SUCCESSFUL);
        else view.showMessage(Constant.InputConstant.ERROR);
        view.showMessage("");
    }
}
