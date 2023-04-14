package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
    /*
    Given an int array **num** of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.


Examples:

```
input: 1, 2, 3

output: [1, 2]
```


```
input: 1

output: [1]
```

```
input: 4, 5, 4, 3, 8

output: [4, 5]
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;
        do {
            System.out.println("Enter size");
            size = input.nextInt();
        } while (size < 0);


        int[] num = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number");
            num[i] = input.nextInt();
        }

        int[] num1 = new int[2];
        if (size>=2) {
            num1[0] = num[0];
            num1[1] = num[1];
        }else {
            num1 = new int[1];
            num1[0] = num[0];
        }

        System.out.println(Arrays.toString(num1));

        input.close();

    }
}
