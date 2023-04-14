package day38_CustomClass.salaryCalculator;

import java.text.DecimalFormat;

public class Salary {
    public int hourlyRate, weeklyHours;
    public double stateTaxRate, federalTaxRate;

    public void setInfo(int hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
    }

    public int salary(){
        int salary = hourlyRate * weeklyHours * 52;
        return salary;
    }

    public double stateTax(){
        double totalStateTax = salary() * stateTaxRate;
        return totalStateTax;
    }

    public double federalTax(){
        double totalFederalTax = salary() * federalTaxRate;
        return totalFederalTax;
    }

    public double salaryAfterTax(){
        double salaryAfterTax = salary() - stateTax() - federalTax();
        return salaryAfterTax;
    }

    public String toString() {

        DecimalFormat df = new DecimalFormat("0.0");

        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary=$" + df.format(salary()) +
                ", totalStateTax=$" + df.format(stateTax()) +
                ", totalFederalTax=$" + df.format(federalTax()) +
                ", salaryAfterTax=$" + df.format(salaryAfterTax()) +
                '}';
    }
}
/*
 SalaryCalculator
    	Attributes:
    		hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

		Actions:
			setInfo(): sets all the fields of SalaryCalculator
			salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
			stateTax(): claculates the totalstateTax
			federalTax(): calculates the total federal tax
			salaryAfterTax(): calculates the salary after tax
			toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */