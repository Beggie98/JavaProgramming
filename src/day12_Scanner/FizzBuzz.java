package day12_Scanner;

public class FizzBuzz {
    /*
    2. write a program that can print any number between 1 ~ 10,
    but for number which is a multiple of 3 print "Fizz" instead of the number and
     for number which is a multiple of 5, print "Buzz" instead of the number,
     and for number which is a multiple of both 3 and 5 both print "FizBuzz" instead of the number.

                  MUST use switch statement



            divisble by 3:  3, 6, 9
            divisble by 5:  5, 10
     */
    public static void main(String[] args) {
        int number = 8;
        String word = "";
        switch (number){
            case 3:
            case 6:
            case 9:
                word = "Fizz";
                break;

            case 5:
            case 10:
                word = "Buzz";
                break;

            case 1: word = "one";
            break;

            case 2: word = "two";
            break;

            case 4: word = "four";
            break;

            case 7: word = "seven";
            break;

            case 8: word = "eight";
            break;

            default: word = "invalid";
            break;
        }
        System.out.println(word);




    }
}
