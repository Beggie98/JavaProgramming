package day48_JavaRecap.cybertekTask;

import java.time.LocalDate;

public final class Tester extends Employee{

    public Tester(String name, char gender, LocalDate dOB, int employeeID, String jobTitle, double salary) {
        super(name, gender, dOB, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle() + " " + getName() + " is attending scrum meeting");
    }

    @Override
    public void sleep() {
        System.out.println(getJobTitle() + " " + getName() + " sleeps 7~8 hours");
    }
}
/*
name, gender, age, DateOfBirth, employeeId, jobTitle, salary
work(), attendMeeting
 */