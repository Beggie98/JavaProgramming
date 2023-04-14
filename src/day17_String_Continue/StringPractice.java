package day17_String_Continue;

import java.util.Scanner;

public class StringPractice {
    /*
    Ask the user enter an account number (String). Check if these account number is valid.
	    > If the account number begins with a “2” the account number should be 7 characters long
	    > If the account number begins with a “5” the account number should be 10 characters long
	    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do
	    not meet the expected results print “Invalid account number”
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an account number");
        String number = input.next();
        String result = "";
        char firstChar = number.charAt(0);

        switch (firstChar){
            case '2':
                if (number.length() == 7){
                    result = "Valid Account";
                }else{
                    result = "Invalid: should be 10 character long";
                }
                break;
            case '5':
                if (number.length() == 10){
                    result = "Valid Account";
                }else{
                    result = "Invalid Account: should be 10 character long";
                }
                break;

            default: result = "Invalid Account: 1st character needs to be 2 or 5";
        }


        /*
        if (number.length()==7 || number.length()==10){
            if (number.charAt(0)=='2' && number.length()==7){
                result = "Valid Account";
            }else if (number.charAt(0)=='5' && number.length()==10){
                System.out.println("Valid Account");
            }else{
                result = "Invalid account number";
            }
        }else{
            result="Invalid Account";
        }
        */

        System.out.println(result);
        input.close();

    }
}
