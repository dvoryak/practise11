package practise11.dao.impl;

import practise11.dao.AbstractDao;
import practise11.dao.Constant;
import practise11.dao.EmployeeDao;
import practise11.model.entity.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDaoImpl extends AbstractDao<Employee> implements EmployeeDao {

    public EmployeeDaoImpl() {
        super(Constant.EMPLOYEE_TABLE);
    }

    @Override
    public List<Employee> getAllEmployeesFromDepartment(final int departmentID) {
        return getAllEmployees()
                .stream()
                .filter((emp)->emp.getDepartmentID() == departmentID)
                .collect(Collectors.toList());
    }

    @Override
    public List<Employee> getAllEmployees() {
        return findAll();
    }

    @Override
    public boolean addEmployee(Employee e) {
        return add(e);
    }

    @Override
    public boolean removeEmployee(int employeeID) {
        return remove(employeeID);
    }

    @Override
    public Employee getEntity(ResultSet resultSet) {
        Employee employee = new Employee();
        try {
            employee.setId(resultSet.getInt("id"));
            employee.setFirstName(resultSet.getString("first_name"));
            employee.setLastName(resultSet.getString("last_name"));
            employee.setPosition(resultSet.getString("position"));
            employee.setDepartmentID(resultSet.getInt("department_id"));
            return employee;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void setEntity(Employee entity, PreparedStatement statement) {
        try {
            statement.setString(1,entity.getLastName());
            statement.setString(2,entity.getFirstName());
            statement.setString(3,entity.getPosition());
            statement.setInt(4,entity.getDepartmentID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int fieldCount() {
        return 4;
    }
}
