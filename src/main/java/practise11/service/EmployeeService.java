package practise11.service;

import practise11.model.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    boolean addEmployee(Employee e);

    boolean removeEmployee(int employeeID);

    List<Employee> getAllEmployeesFromDepartment(int departmentID);
}
