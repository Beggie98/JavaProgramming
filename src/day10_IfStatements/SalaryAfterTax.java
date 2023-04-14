package day10_IfStatements;

public class SalaryAfterTax {
    /*
    Write a program that can calculate the salary after tax based on the following requirments.
				the tax rates are:
						35% for salary of 130K or more
						30% for salary of 100K to 129k
						25% for salary of 80K to 99K
						20% for salary of 79K or less

				in addition,if the person is married, he/she will pay 5% less tax
     */

    public static void main(String[] args) {
        double salary = 150_000;
        double taxRate = 0;
        boolean isMarried = true;

        if(salary >= 130000){// false: salary < 130000
            taxRate = 0.35;
        }else if(salary >= 100000){// false: salary < 100000
            taxRate = 0.30;
        }else if (salary >= 80000){// false: salary < 80000
            taxRate = 0.25;
        }else {//salary < 80000
            taxRate = 0.20;
        }

        if (isMarried){
            taxRate -= 0.05;
        }

        double salaryAfterTax = salary - (salary*taxRate);//take home salary

        System.out.println("Salary after tax = " + salaryAfterTax);




    }


}
