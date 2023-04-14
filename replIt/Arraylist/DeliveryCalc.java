package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of deliveries");
        int size = input.nextInt();

        ArrayList<Integer> deliveries = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the amount of fuel to get to destination " + (i+1));
            deliveries.add(input.nextInt());
        }

        System.out.println("Enter max fuel units");
        int maxFuel = input.nextInt();

        System.out.println("Number of refuels needed: " + refuelTimes(deliveries, maxFuel));
        input.close();

    }

    public static int refuelTimes(ArrayList<Integer> list, int maxFuel){

        int sum = 0;

        for (Integer each : list) {
            sum += each;
        }
        int refuelTimes = sum/maxFuel;

        if (sum%maxFuel != 0){
            refuelTimes++;
        }

        return refuelTimes;

    }

}
/*
A pizza delivery men has a scooter and a lot of deliveries to make, he will have to refuel a few times.

**refuel_times** gets an `arraylist deliveries` of the amount of fuel it will take to get to destinations like:

[1,3,5], first place will take 1 fuel unit to get to second 3 fuel units etc...

the **max_fuel** is the max fuel units in the vehicle fuel tank.

you will need to return how meany refuels it will take to do all deliveries (if the units are bigger then the tank he will refuel along the way in a gas station).

Example:

```
refuel_times([7,7,7],7)

returns: 3 (3 fuel stops 7 units each delivery)
```

```
refuel_times([9,1],3)

returns: 4 (3 fuel stops for first delivery and +1 stop for second)
```

```
refuel_times([100,200,10],10)

returns: 31
```


 */