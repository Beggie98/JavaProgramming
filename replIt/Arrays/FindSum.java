package Arrays;

import java.util.Scanner;

public class FindSum {
    /*
    Given an array **num**, calculate the sum of all numbers in the array and print out to the console.

```
nums → [2, 1, 2, 3, 4]) → 12
nums → [2, 2, 0, 3, 5]) → 12
nums → [1, 3, 5, 7, 9]) → 25
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size");
        int size = input.nextInt();

        int[] num = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number");
            num[i] = input.nextInt();
            sum += num[i];
        }
        System.out.println("Sum = " + sum);
        input.close();

    }
}
