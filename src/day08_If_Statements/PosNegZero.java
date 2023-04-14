package day08_If_Statements;

public class PosNegZero {

    public static void main(String[] args) {

        int number = 0;
        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = number == 0;//!positive && !negative

        if(positive){
            System.out.println(number + " is a positive number");
        }
        if(negative){
            System.out.println(number + " is a negative number");
        }
        if(zero){
            System.out.println(number + " is zero");
        }







    }




}
