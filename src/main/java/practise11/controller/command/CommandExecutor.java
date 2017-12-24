package practise11.controller.command;

import practise11.service.impl.ServiceFactory;
import practise11.view.View;

import java.util.HashMap;

public enum CommandExecutor {
    INSTANCE;

    private HashMap<Type,Command> commandHashMap = new HashMap<>();

    private CommandExecutor() {
        commandHashMap.put(Type.SHOW_MENU,new ShowMenu());
        commandHashMap.put(Type.GET_EMPLOYEE,new ShowEmployeesCommand(ServiceFactory.createEmployeeService()));
        commandHashMap.put(Type.GET_TASKS,new ShowTasksCommand(ServiceFactory.createTaskService()));
        commandHashMap.put(Type.GET_EMPLOYEE_BY_DEPARTMENT,new ShowEmployeesByDepartment(ServiceFactory.createEmployeeService()));
        commandHashMap.put(Type.ADD_TASK,new AddTaskCommand(ServiceFactory.createTaskService()));
        commandHashMap.put(Type.GET_TASKS_BY_EMPLOYEE,new ShowTasksByEmployeeCommand(ServiceFactory.createTaskService()));
        commandHashMap.put(Type.REMOVE_EMPLOYEE,new RemoveEmployeeCommand(ServiceFactory.createEmployeeService()));
        commandHashMap.put(Type.EXIT,new ExitCommand());
    }

    public void execute(Type type, View view) {
        commandHashMap.get(type).execute(view);
    }
}
