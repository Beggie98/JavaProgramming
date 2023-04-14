package day29_ReturnMethods;

public class ReturnMethods {

    public static void main(String[] args) {
        String str = "Anna";

        String reverseStr = reverse(str);//it is reusable now
        boolean isPalindrome = isPalindrome(str);

        System.out.println("isPalindrome = " + isPalindrome);


    }

    public static String reverse(String str){
        //ABC : void will not allow to use the result in the function
                                           // datatype: method needs to return a value
                                           //  return-type of the method is not void, MUST return value

        String result = "";//CBA

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;

    }

    public static boolean isPalindrome(String str){
        String reversedStr = reverse(str);

        return (reversedStr.equalsIgnoreCase(str))? true : false;


       /*
        if (reversedStr.equalsIgnoreCase(str)){
            System.out.println(str + " is palindrome");

        }else {
            System.out.println(str + " is not palindrome");
        }

        */
    }


}
