package day11_Switch;

public class TernaryPractice {
    /*
    1. Given two values: yearly salary and credit score determine if you can get a loan.

			    To be approve for the loan, print: "Loan Approved":
				        Salary: above 60,000
				        Credit Score: above 650
			    	Otherwise print: "Loan Denied"

			    	NOTE: MUST APPLY TERNARY
     */
    public static void main(String[] args) {
        int salary = 70000,
            creditScore = 750;
        String result = "";

        if (salary >= 60000 && creditScore >= 650){
            result = "Loan Approved";
        }else {
            result = "Loan Denied";
        }

        System.out.println(result);
        System.out.println("==================================");
        String result1 = (salary >= 60000 && creditScore >= 650)? "Loan Approved" : "Loan Denied";
        System.out.println(result1);
        System.out.println("----------------------------------");

        /*
        2. Given a sport you play at the community center you will have to pay some enterance fee.

				    Soccer or Tennis fee is: 100
				    Otherwise fee is: 50

				   NOTE: MUST APPLY TERNARY
         */

        String sport = "Tennis";
        int price = (sport == "Soccer" || sport == "Tennis")? 100 : 50;
        System.out.println("price = " + price);

        System.out.println("-------------------------------");
        /*
        3. write a program that checks for the bigger of 3 numbers.
		you get 3 int variables with different values: n1 , n2 and n3
			if n1 is biggest output: "n1 is bigger"
			if n2 is biggest output: "n2 is bigger"
			if n3 is biggest output: "n3 is bigger"

			NOTE: MUST APPLY TERNARY
         */
        int n1 = 20,
            n2 = 15,
            n3 = 5;

        String result2 = (n1 > n2 && n1 > n3)? n1 + " is bigger" :(n2>n1 && n2>n3)?
                n2 + " is bigger" : n3 + " is bigger";

        System.out.println("result2 = " + result2);
        System.out.println("--------------------------------");

        int number = 10;
        String name = "";

        if(number >= 1 && number <= 12){
            name = (number == 1)? "Jan" :(number==2)? "Feb" :(number==3)? "Mar" :(number==4)? "Apr" :(number==5)? "May"
                    :(number==6)? "Jun" :(number==7)? "Jul" :(number==8)? "Aug":(number==9)? "Sep":(number==10)? "Oct"
                    :(number==11)? "Nov": "Dec";
        }else {
            name = "Invalid";
        }
        System.out.println(name);






    }
}
