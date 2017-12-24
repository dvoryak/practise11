package practise11.dao;

import practise11.model.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAllEmployees();

    boolean addEmployee(Employee e);

    boolean removeEmployee(int employeeID);

    List<Employee> getAllEmployeesFromDepartment(int departmentID);
}
