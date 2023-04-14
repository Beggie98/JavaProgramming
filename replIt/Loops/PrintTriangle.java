package Loops;

import java.util.Scanner;

public class PrintTriangle {
    /*
    Write a program that will create a triangle of asterisks based on size **n**.

Example:

```
input: 5

output:
*
**
***
****
*****
```

Example:

```
input: 3

output:
*
**
***
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
