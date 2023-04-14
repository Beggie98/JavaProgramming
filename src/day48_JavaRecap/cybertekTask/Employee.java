package day48_JavaRecap.cybertekTask;

import java.time.LocalDate;

public class Employee extends Person{
    private int employeeID;
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, LocalDate dOB, int employeeID, String jobTitle, double salary) {
        super(name, gender, dOB);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            return;
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }

    public void attendMeeting(){
        System.out.println(getName() + " is in the meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
Employee extends Person:
		employeeId, jobTitle, salary
		work()

 */