package day45_OOP_Inheritance.employeeTask;

public class Driver extends Employee{//Driver IS AN Employee
    public Driver(String name, char gender, int age, long id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void drive(){
        System.out.println(name + " is driving");
    }

}
