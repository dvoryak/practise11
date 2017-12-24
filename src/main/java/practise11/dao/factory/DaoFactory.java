package practise11.dao.factory;

import practise11.dao.DepartmentDao;
import practise11.dao.EmployeeDao;
import practise11.dao.TaskDao;
import practise11.dao.impl.EmployeeDaoImpl;
import practise11.dao.impl.TaskDaoImpl;

public class DaoFactory {

    private DaoFactory() {
    }

    public static TaskDao createTaskDao() {
        return new TaskDaoImpl();
    }

    public static EmployeeDao createEmployeeDao() {
        return new EmployeeDaoImpl();
    }

    public DepartmentDao createDepartmentDao() {
        return null;
    }

}
