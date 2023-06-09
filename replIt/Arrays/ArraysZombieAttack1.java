package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysZombieAttack1 {
    /*
    An array **inhabitants** represents cities and their respective populations. For example, the following arrays shows 8 cities and their respective populations:

[3, 6, 0, 4, 3, 2, 7, 1]

Some cities have a population of 0 due to a pandemic zombie disease that is wiping out the human lives. After each day, every city will lose half of its population.

Write a program to loop though each city population and make it lose half of its population **until all cities have no humans left**.
Make updates to each element in the array And print the array like below for each day:

```
Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
```

Write the program in a way that it will handle any number of people in cities, above was just an example

Hint:

Below expression will print array in this format:

```

System.out.println(Arrays.toString(inhabitants)));

[3, 6, 0, 4, 3, 2, 7, 1]

```
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] cities = new int[8];


        for (int i = 0; i < cities.length; i++) {
            cities[i] = input.nextInt();
        }
        int i = 0;
        int sum = 1;
        System.out.println("Day " + i + " " + Arrays.toString(cities));
        while (!(sum==0)){
            sum=0;
            for (int j = 0; j < cities.length; j++) {
                cities[j] /= 2;
                sum += cities[j];
            }
            i++;
            System.out.println("Day " + i + " " + Arrays.toString(cities));
        }
        input.close();
    }

}
