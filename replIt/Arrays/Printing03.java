package Arrays;

import java.util.Scanner;

public class Printing03 {
    /*
    The code provided in your main method will take in six Strings and save them into an array **arr**.
    Print out the 3 neighboring items of the array in one line until the last line
    each line should contain 3 neighboring items of array element as displayed below


Example:

```
arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda"]

Output:
apple, banana, kiwi
banana, kiwi, grape
kiwi, grape, milk
grape, milk, soda
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] arr = new String[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.next();
        }

        for (int i = 0,j = 1, k = 2; i < arr.length-2 ; i++,j++,k++) {
            System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
        }

    }
}
