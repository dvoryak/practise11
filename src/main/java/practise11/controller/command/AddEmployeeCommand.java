package practise11.controller.command;

import practise11.model.entity.Employee;
import practise11.service.EmployeeService;
import practise11.util.ConsoleHelper;
import practise11.view.View;
import practise11.view.constant.Constant;

import static practise11.view.constant.Constant.*;

public class AddEmployeeCommand implements Command {

    private EmployeeService employeeService;

    public AddEmployeeCommand(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void execute(View view) {
        Employee employee = new Employee();
        view.showMessage(InputConstant.FIRST_NAME);
        employee.setFirstName(ConsoleHelper.readString());
        view.showMessage(InputConstant.LAST_NAME);
        employee.setLastName(ConsoleHelper.readString());
        view.showMessage(InputConstant.POSITION);
        employee.setPosition(ConsoleHelper.readString());
        view.showMessage(InputConstant.DEPARTMENT_ID);
        employee.setDepartmentID(ConsoleHelper.readInt());
        view.showMessage("");
        employeeService.addEmployee(employee);
    }
}
