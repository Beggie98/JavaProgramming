package day05_ArithmeticOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(25/2); //12
        System.out.println(25.0/2); //12.5
        System.out.println(25/2.0); //12.5
        System.out.println(25d/2); //12.5: d - double

//        System.out.println(10 / 0);// cannot divide by 0

        int a = 100/3; //33
        System.out.println("a = " + a);

        double b = 100/3; // 33.0
        System.out.println("b = " + b);

        double c = 100.0/3; // 33.33333333....
        System.out.println("c = " + c);

        System.out.println("----------------------------");

        int n1 = 100;
        int n2 = 40;

        System.out.println(n1%n2); //20: remainder
        System.out.println("------------------------------");
/*
Task:
	1.
		num1 = 10;
		num2 = 3;


		output:
			10 dvide by 3 is equal to 3 with a remainder of 1

 */
        int num1 = 50;
        int num2 = 9;
        int result = num1/num2;
        int remainder = num1%num2;

        System.out.println(num1 + " divided by " + num2 + " is equal to "
                + result + " with a remainder of " + remainder);


    }

}
