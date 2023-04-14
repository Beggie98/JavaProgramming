package day41_CustomClass_Constructors.ScrumTask;

public class Tester {

    public String name;
    public char gender;
    public String jobTitle;
    public int employeeID;
    public double salary;

    public static boolean isCybertekStudent;
    public static boolean isEmployed;

    static {
        isCybertekStudent = true;
        isEmployed = true;
    }

    public Tester(String name, char gender, String jobTitle, int employeeID, double salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=$" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name + " is smoke testing");
    }

}
