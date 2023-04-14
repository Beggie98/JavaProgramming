package day17_String_Continue;

import java.util.Scanner;

public class ValidGmail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your gmail please");
        String gmail = input.next();
        /*
        String ending = email.substring(gmail.indexOf("@"));
        String result = "";

        if (ending.equals("@gmail.com")){
            result = "Valid gmail";
        }else {
            result = "Invalid gmail";
        }
        System.out.println(result);
         */

        boolean isValidGmail = gmail.endsWith("@gmail.com");

        System.out.println("isValidGmail = " + isValidGmail);//true

        System.out.println("-----------------------------------------");

        String url = "www.amazon.com";

        boolean isValidUrl = url.startsWith("www") &&
                ((url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov")));

        System.out.println("------------------------------------");

        System.out.println("Enter a word");
        String word = input.next();

        String result = (word.endsWith("ly"))? "really??" : "never mind";
        String result1 = (word.substring(word.length()-2).equals("ly"))? "really??" : "never mind";
        System.out.println(result);
        System.out.println(result1);

        input.close();



    }

}
