package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(6,2,3,1,9,2,5));
        nums.remove(0);
        nums.remove(0);

        System.out.println(nums);
    }
}
/*
The next ArrayList method we are going to learn is `.remove()`

The `.remove(i)` method will remove the element at index i.  This means that all elements after index i will be shifted back to fill the hole left by the removal.

**Task**: Finish code so that it will remove the first two elements in the given ArrayList of Integers (be careful, this is a little tricky!)

Example:
Say you had an ArrayList called nums with values (6,2,3,1,9,2,5).

```
nums.remove(1);
will result in (6,3,1,9,2,5).
nums.remove(3);
nums.remove(3);

will result in (6,3,1,5), because after the first remove(3) is run, the 2 and 5 get pushed up into the 3rd and 4th index, and then the second remove(3) will remove the 2, leaving the 5.
```

 */