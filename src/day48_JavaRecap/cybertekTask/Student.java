package day48_JavaRecap.cybertekTask;

import java.time.LocalDate;

public class Student extends Person {

    private String schoolName;
    private int id;

    public Student(String name, char gender, LocalDate dOB, String schoolName, int id) {
        super(name, gender, dOB);
        setSchoolName(schoolName);
        setId(id);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void study(){
        System.out.println(getName() + " is studying");
    }

    public void attendClass(){
        System.out.println(getName() + " is attending class");
    }


    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "schoolName='" + schoolName + '\'' +
                ", id=" + id +
                '}';
    }
}
/*
name, gender, age, DateOfBirth, schoolName, studentId
study(), attendClass()
 */