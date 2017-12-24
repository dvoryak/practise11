package practise11.model.entity;

public class Task extends Entity {
    private int taskID;
    private String textTask;
    private int employeeID;

    public Task() {
    }

    public Task(int taskID, String textTask, int employeeID) {
        this.taskID = taskID;
        this.textTask = textTask;
        this.employeeID = employeeID;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getTextTask() {
        return textTask;
    }

    public void setTextTask(String textTask) {
        this.textTask = textTask;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + taskID + '\'' +
                ", textTask='" + textTask + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }
}
