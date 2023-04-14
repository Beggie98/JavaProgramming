package day39_CustomClass_Statics.studentTask;

import java.time.LocalDate;
import java.util.ArrayList;

public class CybertekSchool {
    public static void main(String[] args) {
        Student[] students = {new Student(), new Student(), new Student(), new Student(),
                new Student(), new Student(), new Student(), new Student(), new Student(), new Student()};

        students[0].setInfo("Jacob","Male", LocalDate.of(1995,11,10),111,'A');
        students[1].setInfo("Alex","Male",LocalDate.of(1998,07,15),112,'A');
        students[2].setInfo("Susy","Female",LocalDate.of(1997,01,23),113,'B');
        students[3].setInfo("Frankie","Male",LocalDate.of(1997,05,12),114,'C');
        students[4].setInfo("Nicole","Female",LocalDate.of(1996,12,30),115,'A');
        students[5].setInfo("Nick","Male",LocalDate.of(1999,06,17),116,'B');
        students[6].setInfo("Bryan","Male",LocalDate.of(1999,10,25),117,'B');
        students[7].setInfo("Stella","Female",LocalDate.of(2000,02,22),118,'C');
        students[8].setInfo("Alexa","Female",LocalDate.of(1995,11,20),119,'D');
        students[9].setInfo("Blake","Male",LocalDate.of(2001,9,11),120,'F');


        for (Student each : students) {
            if (each.grade == 'A' || each.grade == 'B'){
                System.out.println(each.name);
            }
        }
        System.out.println("-------------------------------------------");

        ArrayList<Student> femaleStudents = new ArrayList<>();
        ArrayList<Student> maleStudents = new ArrayList<>();

        for (Student each : students) {
            if (each.gender.equals("Female")){
                femaleStudents.add(each);
            }else {
                maleStudents.add(each);
            }
        }
        System.out.println("Female students:");
        for (Student femaleStudent : femaleStudents) {
            System.out.println(femaleStudent);
        }


        System.out.println("Male students:");
        for (Student maleStudent : maleStudents) {
            System.out.println(maleStudent);
        }

        System.out.println("-----------------------------------");

        for (Student student : students) {
            System.out.println(student.name);
        }

    }
}
/*
2. Create a classNamed CybertekSchool
				1. create an Array of students that contains 10 Student objects
				2. print the name of the students who have a grade of B or A
				3. cretae two ArrayLists: femaleStudents, maleStudents

 */