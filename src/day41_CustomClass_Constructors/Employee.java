package day41_CustomClass_Constructors;

public class Employee {
    public String name, jobTitle;
    public double salary;

    public Employee(String name, String jobTitle, double salary){//constructor name MUST be same with class name
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
