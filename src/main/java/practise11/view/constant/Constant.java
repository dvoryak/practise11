package practise11.view.constant;

public interface Constant {

    interface MenuConstant {
        String GET_ALL_EMPLOYEES = "1. Show list of all employees";
        String GET_ALL_TASKS = "2. Show list of all tasks";
        String GET_ALL_EMPLOYEES_BY_DEPARTMENT = "3. Show list of all employees by department";
        String ADD_TASK = "4. Add task for employee";
        String GET_ALL_TASKS_BY_EMPLOYEE = "5. Show list of all tasks by employee";
        String REMOVE_EMPLOYEE = "6. Remove employee";
        String EXIT = "7. Exit";
    }

    interface InputConstant {
        String TASK_TEXT = "Enter a text of task";
        String EMPLOYEE_ID = "Enter a employee id";
        String FIRST_NAME = "Enter a first name of employee";
        String LAST_NAME = "Enter a last name of employee";
        String POSITION = "Enter a position of employee";
        String DEPARTMENT_ID = "Enter a department id";
        String EMPTY_LIST = "The list is empty";
        String DELETE_SUCCESSFUL = "Successful deleted";
        String ERROR = "Error";
    }


}
