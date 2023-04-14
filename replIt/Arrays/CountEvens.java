package Arrays;

import java.util.Scanner;

public class CountEvens {
    /*
    Given an array **nums**, count and print the number of even numbers in the array

Examples:

```
nums → [2, 1, 2, 3, 4]) → 3

nums → [2, 2, 0, 3, 5]) → 3

nums → [1, 3, 5, 7, 9]) → 0
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = input.nextInt();


        int[] nums = new int[size];

        int countEvens = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number");
            nums[i] = input.nextInt();
            if (nums[i]%2==0){
                countEvens++;
            }
        }
        System.out.println("Number of evens: " + countEvens);

    }
}
