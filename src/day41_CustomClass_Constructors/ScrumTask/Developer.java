package day41_CustomClass_Constructors.ScrumTask;

public class Developer {
    public String name;
    public char gender;
    public String jobTitle;
    public int employeeID;
    public double salary;

    public static boolean isEmployed = true;
    public static boolean hatesTester = true;

    public Developer(String name, char gender, String jobTitle, int employeeID, double salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }

    public void fixingBugs(){
        System.out.println(name + " is crying");
    }


}
