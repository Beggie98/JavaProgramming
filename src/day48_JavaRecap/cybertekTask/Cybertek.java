package day48_JavaRecap.cybertekTask;

import java.time.LocalDate;

public class Cybertek {

    public static void main(String[] args) {

        Tester tester = new Tester("Yasin",'M', LocalDate.of(1995,5,28),11,"SDET",110000);
        tester.eat("Steak");
        tester.drink("coffee");
        tester.sleep();
        tester.work();
        tester.attendMeeting();

        System.out.println(tester);

        System.out.println("-------------------------------------------------------");

        Developer developer = new Developer("Mucahit",'M',LocalDate.of(1992,6,16),12,"Java Developer",120000);
        developer.eat("");
        developer.drink("");
        developer.sleep();
        developer.work();
        developer.attendMeeting();

        System.out.println(developer);

        System.out.println("------------------------------------------------------------");
        Teacher teacher = new Teacher("Asiya",'F',LocalDate.of(1996,8,18),18,"Soft Skill Teacher",130000);
        teacher.eat("");
        teacher.drink("");
        teacher.sleep();
        teacher.work();
        teacher.attendMeeting();

        System.out.println(teacher);

        System.out.println("-----------------------------------------------------------------");
        Student student = new Student("Yulia",'F',LocalDate.of(1996,5,13),"Cybertek",26);
        student.eat("");
        student.drink("");
        student.sleep();
        //student.word();
        //student.attendMeeting();
        student.study();
        student.attendClass();

        System.out.println(student);


    }

}
