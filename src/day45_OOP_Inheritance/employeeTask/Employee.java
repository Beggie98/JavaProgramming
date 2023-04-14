package day45_OOP_Inheritance.employeeTask;

public class Employee extends Person {//Employee IS A Person

    public Employee(String name, char gender, int age, long id, String jobTitle, double salary) {
        super(name, gender, age);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public long id;
    public String jobTitle;
    public double salary;


    public void work(){
        System.out.println(name + " is working");
    }

    public void attendMeeting(){
        System.out.println(name + " is in a meeting");
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
    //eat(), sleep(), drink()
}
/*
Employee extends Person:
		name, gender, age, id, job title, salary

		work(), attenMeeting()
 */