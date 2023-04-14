package day54_Polymorphism_Recap;

import day45_OOP_Inheritance.employeeTask.Developer;
import day45_OOP_Inheritance.employeeTask.Employee;
import day45_OOP_Inheritance.employeeTask.Tester;
import day47_Recap.browserTask.Firefox;
import day53_Abstraction_and_Polymorphism.webDriverTask.ChromeDriver;
import day53_Abstraction_and_Polymorphism.webDriverTask.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmupTask {

    public static void main(String[] args) {

        Employee employee1 = new Developer("John",'M',32,11,"QA",110000);
        //employee1.work();//objectType decides which implementation will be executed
        ((Developer) employee1).code();


        WebDriver driver = new ChromeDriver();
        //(Firefox)driver//Exception, no IS A relation between ChromeDriver and FirefoxDriver
        //((ChromeDriver)driver).

        Employee[] employees = {
                new Tester("John",'M',32,11,"QA",110000),
                new Developer("Selda",'F',27,12,"Java Developer",128000),
                new Tester("Robinson", 'M',28,10,"SDET",120000),
                new Developer("Aysu",'F',23,13,"Software Developer",135000),
                new Tester("Jimmy",'M',30,14,"SDET",105000),
                new Developer("Gulistan",'F',26,17,"Web Developer",130000),
                new Tester("Breanna",'F',28,15,"QE",120000),
                new Developer("Ivana",'F',29,18,"Front-end Developer",140000),
                new Tester("Shay",'F',25,16,"SDET",130000),
                new Developer("Sophie",'F',26,20,"Back-end Developer",150000),
                new Tester("Aaron",'M',34,19,"SDET",115000),
                new Developer("Ibrahim",'F',26,22,"Full Stack Developer",142000),
                new Tester("Feruza",'F',24,21,"QE",125000)
        };

        List<Employee> scrumMembers = new ArrayList<>(Arrays.asList(employees));//polymorphism: upcasting (casted automatically)
        System.out.println(scrumMembers);
        System.out.println(scrumMembers.size());

        System.out.println("---------------------------------------------------------");



        //((ArrayList)scrumMembers) - down-casting: used for accessing the methods and variables of the object type

        List<Tester> testers = new ArrayList<>();//polymorphism: upcasting (casted automatically)

        List<Developer> developers = new ArrayList<>();//polymorphism: upcasting (casted automatically)

        for (Employee each : scrumMembers) {
            if (each instanceof Tester){
                testers.add((Tester) each);
            } else if (each instanceof Developer) {
                developers.add((Developer) each);
            }
        }

        System.out.println("testers = " + testers);
        System.out.println("----------------------------------------------");
        System.out.println("developers = " + developers);


        System.out.println("--------------------------------------------------");

        double maxSalaryOfTester = Double.MIN_VALUE;
        String nameOfTesterWithMaxSalary = "";

        double minSalaryOfTester = Double.MAX_VALUE;
        String nameOfTesterWithMinSalary = "";

        for (Tester tester : testers) {
            if (tester.salary > maxSalaryOfTester){
                maxSalaryOfTester = tester.salary;
                nameOfTesterWithMaxSalary = tester.name;
            }

            if (tester.salary < minSalaryOfTester){
                minSalaryOfTester = tester.salary;
                nameOfTesterWithMinSalary = tester.name;
            }

        }


        System.out.println("maxSalaryOfTester = " + maxSalaryOfTester);
        System.out.println("nameOfTesterWithMaxSalary = " + nameOfTesterWithMaxSalary);

        System.out.println("minSalaryOfTester = " + minSalaryOfTester);
        System.out.println("nameOfTesterWithMinSalary = " + nameOfTesterWithMinSalary);

        System.out.println("----------------------------------------------------------");

        double maxSalaryOfDev = Double.MIN_VALUE;
        double minSalaryOfDev = Double.MAX_VALUE;

        String nameOfDevWithMaxSalary = "";
        String nameOfDevWithMinSalary = "";

        for (Developer each : developers) {
            if (each.salary > maxSalaryOfDev){
                maxSalaryOfDev = each.salary;
                nameOfDevWithMaxSalary = each.name;
            }

            if (each.salary < minSalaryOfDev){
                minSalaryOfDev = each.salary;
                nameOfDevWithMinSalary = each.name;
            }

        }

        System.out.println("maxSalaryOfDev = " + maxSalaryOfDev);
        System.out.println("nameOfDevWithMaxSalary = " + nameOfDevWithMaxSalary);

        System.out.println("minSalaryOfDev = " + minSalaryOfDev);
        System.out.println("nameOfDevWithMinSalary = " + nameOfDevWithMinSalary);
    }


}
