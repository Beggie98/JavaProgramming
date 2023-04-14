package day05_ArithmeticOperators;

public class OddOrEven {

    public static void main(String[] args) {
        int number = 99;

        boolean isEven = number%2 == 0; // if the remainder is of number divided by 2 is equal to zero, then number is even
        boolean isOdd = number%2 > 0; // if the remainder is of number divided by 2 is greater than zero, then number is odd

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);

    }

}
