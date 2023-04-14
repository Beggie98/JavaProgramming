package day41_CustomClass_Constructors.StudentTask;

import java.time.LocalDate;
import java.util.ArrayList;

public class CybertekSchool {
    public static void main(String[] args) {
        Student student1 = new Student("Jacob",'M', LocalDate.of(1995,11,10),111,'A');
        Student student2 = new Student("Alex",'M',LocalDate.of(1998,07,15),112,'A');
        Student student3 = new Student("Susy",'F',LocalDate.of(1997,01,23),113,'B');
        Student student4 = new Student("Frankie",'M',LocalDate.of(1997,05,12),114,'C');
        Student student5 = new Student("Nicole",'F',LocalDate.of(1996,12,30),115,'A');

        Student[] group1 = {student1, student2, student3, student4, student5};

        for (Student eachStudent : group1) {
            if (eachStudent.grade == 'A' || eachStudent.grade == 'B'){
                System.out.println(eachStudent.name);
            }
        }

        System.out.println("------------------------------------------");

        ArrayList<Student> femaleStudents = new ArrayList<>();
        ArrayList<Student> maleStudents = new ArrayList<>();

        for (Student each : group1) {
            if (each.gender == 'F'){
                femaleStudents.add(each);
            } else if (each.gender == 'M') {
                maleStudents.add(each);
            }
        }

        for (Student femaleStudent : femaleStudents) {
            System.out.println(femaleStudent);
        }
        System.out.println("---------------------------");
        for (Student maleStudent : maleStudents) {
            System.out.println(maleStudent);
        }


    }
}
