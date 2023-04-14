package day04_Variables;

public class EmployeeInfo {
    /*
    1. declare the following variables:
    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
    2. full info of the employee
     */
    public static void main(String[] args) {
        String firstName = "Bekzod";
        String lastName = "Juraev";
        String gender = "Male";
        int age = 25;
        String companyName = "Microsoft";
        String jobTitle = "Java Developer";
        boolean isFullTime = true;
        boolean isMarried = true;
        double salary = 110000;

        String fullName = firstName + " " + lastName;

        System.out.println("Empoyee's Full Name is " + fullName);

        // Aaron King is Male

        System.out.println(fullName + " is " + gender);

        //fullName is age years old

        System.out.println(fullName + " is " + age + " years old");

        //Bekzod Juraev works at Microsoft
        System.out.println(fullName + " works at " + companyName);

        //Bekzod Juraev's job title is Java Developer
        System.out.println(fullName + "'s job title is " + jobTitle);


        System.out.println(fullName + " is full time employee: " + isFullTime);
        System.out.println(fullName + " is married: " + isMarried);
        System.out.println(fullName + " is making $ " + salary);


    }

}
