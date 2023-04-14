package day04_Variables;

public class TaxCalculation {

    public static void main(String[] args) {

        int salary = 120000;
        double stateTaxRate = 0.08;
        double federalTax = 0.21;
        //You need to pay amount to stateTax
        double totalStateTax = salary * stateTaxRate;
        double totalFederalTax = salary * federalTax;
        double salaryAfterTax = salary - totalStateTax - totalFederalTax;

        System.out.println("Your salary is $" + salary);
        System.out.println("You need to pay $" + totalStateTax + " to state tax");
        System.out.println("You need to pay $" + totalFederalTax + " to federal tax");
        System.out.println("Your take home salary is $" + salaryAfterTax);


    }

}
