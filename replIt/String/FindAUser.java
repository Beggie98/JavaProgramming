package String;

import java.util.Scanner;

public class FindAUser {
    /*
    Write a program that will look up a user.


    Assume that you have only 2 users: Max Payne and Alan Wake.
    First, ask user to enter full name. Display message: "Enter full name:". Then take input from user.
    If name is equals to either "Max Payne" or "Alan Wake",  display message: "User found!". Otherwise,
    display message: "User not found!". _`Please make your search case insensitive!`_

    Example:


```
Display message: Enter full name:
```

```
input: Max Payne
```

```
Display message: User found!
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a full name please");
        String fullName = input.nextLine();
        String result = "";

        if (fullName.equalsIgnoreCase("Max Payne") || fullName.equalsIgnoreCase("Alan Wake")){
            result = "User found";
        }else {
            result = "User not found!";
        }

        System.out.println(result);
        input.close();
    }
}
