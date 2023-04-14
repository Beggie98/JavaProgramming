package String;

import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {
        /*
        Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

```
Input: craig_federighi@apple.com

```
```
Output:
First name: Craig
Last name: Federighi
Domain: apple
```

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an email please");
        String email = input.next();

        if (email.contains("_")){
            String firstName = email.substring(0,1).toUpperCase() + email.substring(1,email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase() + email.substring(email.indexOf("_")+2, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));

            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Domain: " + domain);
        }else {
            System.out.println("Invalid input");
        }


        input.close();
    }
}
