package Loops;

import java.util.Scanner;

public class ZombieAttack {
    /*
    A variable **inhabitants** represents a city and its respective populations.
    City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
    After each day, a city will lose half of its population.
    Write a program to loop the city population and make it lose half of its population **until population is zero**.
    Print the each day like below for each day:



Example - inhabitants are 6

```
Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----
```


Example- inhabitants are 0

```
---- EXTINCT ----
```


Example- inhabitants are 20


```
Day 0 [20]
Day 1 [10]
Day 2 [5]
Day 3 [2]
Day 4 [1]
---- EXTINCT ----
```


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of inhabitants:");
        int number = input.nextInt();
        int i = 0;
        while (number > 0){
            System.out.println("Day " + i + " [" + number + "]");
            number /= 2;
            i++;
        }
        System.out.println("--- EXTINCT ---");

        input.close();

    }
}
