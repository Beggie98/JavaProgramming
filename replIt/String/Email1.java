package String;

import java.util.Scanner;

public class Email1 {
    /*
    Swap first name with last name in the email (Seperated by an underscore).
    If the email doesn't contain an underscore print the given input email.

Examples:


```
input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
```

```
input: barakobama@gmail.com

output: barakobama@gmail.com
```


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an email");
        String email = input.next();
        if (email.contains("_")) {
            String firsName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));

            String newEmail = lastName + "_" + firsName + email.substring(email.indexOf("@"));

            System.out.println(newEmail);
        }else {
            System.out.println(email);
        }

        input.close();
    }
}
