package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MakeLast {
    /*
    Given an int array **nums** print a new array with double the length where its
    last element is the same as the original array, and all the other elements are 0.
    The original array will be length 1 or more.
Hint: by default, a new int array contains all 0's.

Examples:

```
input: 4 5 6

output: [0, 0, 0, 0, 0, 6]
```

```
input: 0

output: [0, 0]
```

```
input: 1 2 3 4

output: [0, 0, 0, 0, 0, 0, 0, 4]
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a size");
        int size = input.nextInt();

        int[] nums = new int[size];
        int[] nums1 = new int[nums.length*2];

        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();
        }

        nums1[nums1.length-1] = nums[nums.length-1];

        System.out.println(Arrays.toString(nums1));
        input.nextInt();
    }
}

