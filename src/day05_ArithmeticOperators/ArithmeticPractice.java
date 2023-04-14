package day05_ArithmeticOperators;

public class ArithmeticPractice {

    public static void main(String[] args) {
        int number = 33;
        int remainder = number%5;

        boolean isDivisible = remainder == 0;// if the remainder of number/5 is zero, then it's evenly divided by 5

        System.out.println(number + " is divisible by 5: " + isDivisible );
    }

}
