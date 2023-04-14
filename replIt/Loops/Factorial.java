package Loops;

import java.util.Scanner;

public class Factorial {
    /*
    In mathematics a **factorial** of a positive integer _n_, denoted by _n_!,
    is the product of all positive integers less than or equal to _n_.
    Calculate factorial and output result to the console.


Example:

```
input: 5
output: 120

5 * 4 * 3 * 2 * 1
```

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();
        int factorial = 1;

        for (int i = number; i >=1 ; i--) {
            factorial *= i;
        }
        System.out.println("factorial = " + factorial);
    }
}
