package day42_Constructors_And_GarbageCollection;

public class Employee {

    public String name, jobTitle;
    public int id;
    public double salary;

    public Employee(String name){
        this.name = name;
        jobTitle = "Unknown";
    }

    public Employee(String name, String jobTitle){
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, int id) {
        this(name, jobTitle);
        this.id = id;
    }

    public Employee(String name, String jobTitle, int id, double salary) {
        this(name, jobTitle, id);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
/*
1. Class Name: Employee
			instance variables:
					name, jobTitle, id, salary

			1st constructor: initializes the name ONLY

			2nd constructor: initializes name & jobTitle
						(MUST use constructor call to set the name)

			3rd Constructor: initializes name, jobTitle and id
						(MUST use constructor call to set the name & jobTitle)

			4th Constructor: initializes all the instances
						(MUST use constructor call to set the name, jobTitle, and id)

			isntance methods: toString()
 */