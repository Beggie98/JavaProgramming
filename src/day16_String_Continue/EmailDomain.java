package day16_String_Continue;

import java.util.Scanner;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "Cybertek.School@gmail.com";
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        //                               beginning index,     ending index
        System.out.println("domain = " + domain);
    }
}
