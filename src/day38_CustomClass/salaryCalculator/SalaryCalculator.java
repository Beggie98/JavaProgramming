package day38_CustomClass.salaryCalculator;

public class SalaryCalculator {
    public static void main(String[] args) {
        Salary salary1 = new Salary();
        salary1.setInfo(65,45,7,23);
        System.out.println(salary1);
        System.out.println("--------------------------------");

        Salary employee1 = new Salary();
        employee1.setInfo(50,40,5,25);
        System.out.println(employee1);
    }
}
