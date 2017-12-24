package practise11.controller.command;

import practise11.model.entity.Employee;
import practise11.service.EmployeeService;
import practise11.util.ConsoleHelper;
import practise11.view.View;
import practise11.view.constant.Constant;

import java.util.List;

public class ShowEmployeesByDepartment implements Command {

    private EmployeeService employeeService;

    public ShowEmployeesByDepartment(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void execute(View view) {
        view.showMessage(Constant.InputConstant.DEPARTMENT_ID);
        int id = ConsoleHelper.readInt();
        view.showMessage("Employees :");
        List<Employee> allEmployees = employeeService.getAllEmployeesFromDepartment(id);
        if(allEmployees.size() == 0)
            view.showMessage(Constant.InputConstant.EMPTY_LIST);
        allEmployees.forEach((emp) -> view.showMessage(emp.toString()));
        view.showMessage("");
    }
}
