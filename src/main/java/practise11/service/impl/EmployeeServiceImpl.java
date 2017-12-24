package practise11.service.impl;

import practise11.dao.EmployeeDao;
import practise11.dao.TaskDao;
import practise11.model.entity.Employee;
import practise11.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @Override
    public boolean addEmployee(Employee e) {
        return e == null ? false : employeeDao.addEmployee(e);
    }

    @Override
    public boolean removeEmployee(int employeeID) {
        return employeeID < 0 ? false : employeeDao.removeEmployee(employeeID);
    }

    @Override
    public List<Employee> getAllEmployeesFromDepartment(int departmentID) {
        return departmentID < 0 ? null : employeeDao.getAllEmployeesFromDepartment(departmentID);
    }
}
