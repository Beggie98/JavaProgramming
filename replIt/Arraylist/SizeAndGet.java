package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SizeAndGet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println("sum = " + sum);

    }
}
/*
The next two methods are `.size()` and `.get()`.

If we have an ArrayList called someList and an Array called arr, these two do the same thing:

```
someList.size()

arr.length
```

In other words, .size() returns the length (size) of the list.

The method .get(i) will return the element found at index i.  The following two expressions also do the same thing:

```
someList.get(4)

arr[4]
```

**Task:** Given an ArrayList of Integers called **list**, find and print the sum of all the numbers in the list
 */