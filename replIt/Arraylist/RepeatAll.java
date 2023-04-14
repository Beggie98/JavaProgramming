package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RepeatAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size for the list");
        int size = input.nextInt();
        ArrayList<Boolean> list = new ArrayList<>(Arrays.asList());

        for (int i = 0; i < size; i++) {
            list.add(input.nextBoolean());
        }
        System.out.println(repeatAll(list));
        input.close();
    }

    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> list){
        list.addAll(list);
        return list;
    }

}
/*
Create a static method that:

- is called `repeatAll`
- returns `ArrayList of Booleans`
- takes in a single parameter - an `ArrayList of Booleans`

This method should modify its ArrayList parameter by repeating its ArrayList values.

For example, if the parameter is

```
(true, false, false)
```

The modified ArrayList should be

```
(true, false, false, true, false, false)
```
 */