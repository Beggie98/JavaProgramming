package day51_Abstraction.employeeTask;

public final class ProductOwner extends Employee{
    public ProductOwner(String name, char gender, String jobTitle, double salary, int id) {
        super(name, gender, jobTitle, salary, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " " + getJobTitle() + " is ");
    }
}
