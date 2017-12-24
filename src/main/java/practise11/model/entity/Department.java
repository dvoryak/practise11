package practise11.model.entity;

import java.util.Set;

public class Department extends Entity{
    private int departmentID;
    private String departmentName;
    private String number;

    public Department() {
    }

    public Department(int departmentID, String departmentName, String number) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.number = number;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Department{" +
                "departmentID=" + departmentID +
                ", departmentName='" + departmentName + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
