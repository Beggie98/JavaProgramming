package day12_Scanner;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number please: ");
        int number = input.nextInt();

//        if (number%2==0){
//            System.out.println(number + " is even");
//        }else {
//            System.out.println(number + " is odd");
//        }
        System.out.println(  (number%2==0)? "Even" : "Odd"  );
        System.out.println(  (number>0) ? "Positive" :(number<0)? "Negative" : "Zero"  );

    }

}
