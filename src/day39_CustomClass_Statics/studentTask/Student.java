package day39_CustomClass_Statics.studentTask;

import java.time.LocalDate;

public class Student {
    public String name, gender;
    public int age, studentID;
    public LocalDate DoB;
    public char grade;


    public void setInfo(String name, String gender, LocalDate DoB, int studentID, char grade) {
        this.name = name;
        this.gender = gender;
        this.DoB = DoB;
        this.studentID = studentID;
        this.grade = grade;
        age = LocalDate.now().getYear() - DoB.getYear();
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + DoB +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
/*
StudentTask
		1. create a class named Student that has the followings features:
			Attributes:
				name, gender, dateOfBirth, age, studentID, grade

			Methods:
				setInfo(): sets all the attributes of the student object
				toString(): returns the full info of student Object


		2. Create a classNamed CybertekSchool
				1. create an Array of students that contains 10 Student objects
				2. print the name of the students who have a grade of B or A
				3. cretae two ArrayLists: femaleStudents, maleStudents
 */