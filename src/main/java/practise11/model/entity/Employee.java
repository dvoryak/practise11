package practise11.model.entity;

public class Employee extends Entity {
    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private int departmentID;

    public Employee() {
    }

    public Employee(int employeeID, String firstName, String lastName, String position, int departmentID) {
        this.id = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.departmentID = departmentID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(" ")
                .append(firstName).append(" ").append(lastName)
                .append(" ").append(position).append(" departmentId = " ).append(departmentID);
        return sb.toString();
    }
}
