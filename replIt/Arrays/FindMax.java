package Arrays;

import java.util.Scanner;

public class FindMax {
    /*
    Given an array **num**, get the max number in the array and print it out to the console.

```
nums → [2, 4, 2, 3, -2]) → 4
nums → [2, 2, 5, 3, 0 ]) → 5
nums → [1, 33, 5, 7, 9]) → 33
```

hint:

_create a variable called max and before you start searching assume the first item value is the max._

_loop through each and every item and check for whether the value max is less than the item value._

_if so assign the value to the max to overwrite existing max._

_you will get the max value when you are done with the loop_
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size");
        int size = input.nextInt();

        int[] nums = new int[size];
        int max = nums[0];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number");
            nums[i] = input.nextInt();
            if (nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println("Max = " + max);

    }
}
