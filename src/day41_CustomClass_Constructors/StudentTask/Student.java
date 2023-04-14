package day41_CustomClass_Constructors.StudentTask;

import java.time.LocalDate;

public class Student {
    public String name;
    public char gender, grade;
    public LocalDate dateOfBirth;
    public int age, studentID;

    public static String schoolName;

    static {
        schoolName = "Cybertek School";
    }

    public Student(String name, char gender, LocalDate dateOfBirth, int studentID, char grade){
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.studentID = studentID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", studentID=" + studentID +
                '}';
    }
}
