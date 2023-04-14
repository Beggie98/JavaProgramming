package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {
    /*
    Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
    You may modify and print the given array, or print a new array.`

Example:
```
input: 6, 2, 5, 3

output: [2, 5, 3, 6]
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size");
        int size = input.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i]= input.nextInt();
        }
        System.out.println();

        int[] numsShifted = new int[nums.length];

        for (int i = 1, j=0; i < nums.length; i++,j++) {

            numsShifted[j] = nums[i];

        }
        numsShifted[numsShifted.length-1] = nums[0];
        System.out.println(Arrays.toString(numsShifted));

    }
}
