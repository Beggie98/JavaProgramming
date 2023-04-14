package day07_ShortHand_Relational;

public class SwipeTwoNumbers {
/*
1. write a program that can swipe two variables' value by using a temporary variable
			ex:
				if a= 20, b=30

				output:
					a = 30
					b = 20

 */
/*
    In order to solve it, we need to add a third variable (c) that will store data of either a or b temporarily
 */
    public static void main(String[] args) {
        int a = 20;//20
        int b = 30;//30
        int c = a;//c = 20

        a = b; // a = 30
        b = c;// b = 20

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


}
