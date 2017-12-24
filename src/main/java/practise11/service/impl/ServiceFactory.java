package practise11.service.impl;

import practise11.dao.factory.DaoFactory;
import practise11.service.EmployeeService;
import practise11.service.TaskService;

public class ServiceFactory {
    private ServiceFactory() {
    }

    public static EmployeeService createEmployeeService() {
        return new EmployeeServiceImpl(DaoFactory.createEmployeeDao());
    }

    public static TaskService createTaskService() {
        return new TaskServiceImpl(DaoFactory.createTaskDao());
    }

}

