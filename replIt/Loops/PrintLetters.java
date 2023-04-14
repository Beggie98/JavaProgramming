package Loops;

import java.util.Scanner;

public class PrintLetters {
    /*
    Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

Example:

```
input:
A
Z

output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
```

Example:

```
input:
a
f

output: abcdef
```

Example:

```
input:
a
d

output: abcd
```

Example:

```
input:
B
O

output: BCDEFGHIJKLMNO
```

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first char");
        char ch1 = input.next().charAt(0);
        System.out.println("Enter second char");
        char ch2 = input.next().charAt(0);
        boolean validEntry = ((ch1>='a' && ch1 <='z')||(ch1>='A' && ch1 <='Z'))&&((ch2>='a' && ch2 <='z')||(ch2>='A' && ch2 <='Z'));
        if (validEntry) {
            for (int i = ch1; i <= ch2; i++) {
                System.out.print((char) i);
            }
        }else {
            System.out.println("Invalid entry");
        }
        input.close();

    }
}
