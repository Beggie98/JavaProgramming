package day07_ShortHand_Relational;

public class PosNegZero {

    public static void main(String[] args) {
        int number = 0;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        //boolean isZero = isNegative == false && isPositive == false;
        boolean isZero = number == 0;

        System.out.println(number + " is a positive number: " + isPositive);
        System.out.println(number + " is a negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);




    }


}
