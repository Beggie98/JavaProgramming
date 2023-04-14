package day45_OOP_Inheritance.employeeTask;

public class Tester extends Employee{//Tester IS AN Employee

    public Tester(String name, char gender, int age, long id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void testing(){
        System.out.println(jobTitle + " " + name + " is testing");
    }

}
/*
Tester extends Employee:
		name, gender, age, id, job title, salary

		testing()

6 variables and 7 methods including those inherited from Employee class
 */