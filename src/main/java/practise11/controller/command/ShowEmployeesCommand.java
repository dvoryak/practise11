package practise11.controller.command;

import practise11.dao.EmployeeDao;
import practise11.model.entity.Employee;
import practise11.service.EmployeeService;
import practise11.view.View;
import practise11.view.constant.Constant;

import java.util.List;

public class ShowEmployeesCommand implements Command {

    private EmployeeService employeeService;

    public ShowEmployeesCommand(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void execute(View view) {
        view.showMessage("Employees :");
        List<Employee> allEmployees = employeeService.getAllEmployees();
        if(allEmployees.size() == 0)
            view.showMessage(Constant.InputConstant.EMPTY_LIST);
        allEmployees.forEach((emp) -> view.showMessage(emp.toString()));
        view.showMessage("");
    }
}
