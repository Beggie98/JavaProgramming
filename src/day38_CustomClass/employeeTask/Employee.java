package day38_CustomClass.employeeTask;

public class Employee {

    public String employeeName;
    public char gender;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public void setInfo(String employeeName, char gender, int employeeID, String jobTitle, double salary) {
        this.employeeName = employeeName;
        this.gender = gender;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", gender=" + gender +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
