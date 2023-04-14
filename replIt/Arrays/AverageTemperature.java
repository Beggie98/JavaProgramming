package Arrays;

import java.util.Scanner;

public class AverageTemperature {
    /*
    Given an array **temps** with temperature values find and print the average value


Example:

```
input: 80 88 88 84 82 78 60 68

output: 78.5
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size");
        int size = input.nextInt();
        int[] temps = new int[size];
        double sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number");
            temps[i] = input.nextInt();
            sum += temps[i];
        }

        System.out.println("Average: " + (sum/size));

        input.close();
    }
}
