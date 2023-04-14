package day48_JavaRecap.cybertekTask;

import java.time.LocalDate;

public class Teacher extends Employee{
    public Teacher(String name, char gender, LocalDate dOB, int employeeID, String jobTitle, double salary) {
        super(name, gender, dOB, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is teaching");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle() + " " + getName() + " is attending teacher' meeting");
    }
}
/*
name, gender, age, DateOfBirth, employeeId, jobTitle, salary
work(), attendMeeting
 */