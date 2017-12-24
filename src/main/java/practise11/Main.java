package practise11;

import practise11.controller.Controller;
import practise11.dao.TaskDao;
import practise11.dao.impl.EmployeeDaoImpl;
import practise11.dao.impl.TaskDaoImpl;
import practise11.model.entity.Employee;
import practise11.view.View;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        controller.run();
    }
}
