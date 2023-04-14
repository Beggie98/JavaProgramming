package day03_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        byte hourlyRate = 50;
        byte weeklyhours = 40;
        int salary = hourlyRate * weeklyhours * 52;

        System.out.println(salary);


        double taxRate = 0.32;
        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;
        System.out.println(totalTax);
        System.out.println(salaryAfterTax);

    }

}
