package Arrays;

import java.util.Scanner;

public class SplitEmail {
    /*
    Given a String variable **email**, write code using split method to print email id and domain in separate lines.

Example:

```
email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
```

If email contains no @ character or multiple @ characters then print _**invalid email**_:

```
email -> hello-gmail.com

Output:
invalid email
```

```
email -> my@fancy@email.com

Output:
invalid email
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an email");
        String email = input.next();
        if (email.contains("@")) {
            if (email.indexOf("@") == email.lastIndexOf("@")) {
                String[] arr = email.split("@");
                System.out.println("Email id:" + arr[0]);
                System.out.println("Email domain:" + arr[1]);
            }else {
                System.out.println("Invalid Email");
            }
        } else {
            System.out.println("Invalid Email");
        }

        input.close();
    }
}
