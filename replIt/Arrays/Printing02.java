package Arrays;

import java.util.Scanner;

public class Printing02 {
    /*
    The code provided in your main method will take in eight Strings and save them into an array **arr**.
    Print out the 4 lines using for loop: each line should contain a pair of array elements

Example:

```
arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"]
```

```
Output:
apple , banana
kiwi , grape
milk, soda
juice, coffee
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.next();
        }

        for (int i = 0, j=1; i < arr.length; i+=2,j+=2) {
            System.out.println(arr[i] + " , " + arr[j]);
        }
        input.close();
    }
}
