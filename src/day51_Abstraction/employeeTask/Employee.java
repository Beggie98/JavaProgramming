package day51_Abstraction.employeeTask;

public abstract class Employee {

    private final String name;
    private final char gender;
    private String jobTitle;
    private double salary;
    private int id;

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
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
        if (salary <= 0){
            throw new RuntimeException("Invalid amount: " + salary);
        }
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0){
            throw new RuntimeException("Invalid id: " + id);
        }
        this.id = id;
    }

    public Employee(String name, char gender, String jobTitle, double salary, int id) {
        this.name = name;
        this.gender = gender;
        setJobTitle(jobTitle);
        setSalary(salary);
        setId(id);
    }

    public abstract void work();

}
/*
Employee: Encapsulation, Inheritance, Abstraction, overriding, class & object, constructors

	Employee:
		name, gender, jobTitle, salary, id
		work();

	Tester extends Employee


	Developer extends Employee


	SM extends Employee

	Teacher extends Employee

	PO extends Employee
 */