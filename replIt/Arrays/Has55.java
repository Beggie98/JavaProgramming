package Arrays;

import java.util.Scanner;

public class Has55 {
    /*
    Given an array **nums**, print `true` if the array contains a 5 next to a 5 anywhere in the array.
    If no consecutive 5s or no 5s are detected in your code then print `false`.

```
nums → [1, 5, 5, 1, 1] → true
nums → [1, 8, 5, 5, 0] → true
nums → [1, 5, 4, 1, 5] → false
nums → [1, 4, 4, 1, 99] → false
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a size");
        int size = input.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();
        }

            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j] == 5 && nums[j++] == nums[j]){
                    System.out.println(true);
                    System.exit(0);
                }
        }
            System.out.println(false);

    }
}
