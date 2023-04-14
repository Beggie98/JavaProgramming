package Arraylist;

import java.util.ArrayList;

public class Add {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Dillon");
        names.add("Sam");
        names.add("Alex");

        System.out.println(names);
        System.out.println(names.size());
    }
}
/*
We will be manipulating elements of an ArrayList by using List methods.

The first List method we will learn is `.add()`

The following code will take an ArrayList of Strings called strs and add "Hello" to it.

```
strs.add("Hello");
```

The syntax is:

```
arraylistvariable.add(data_to_add);
```

Add three names (any names) to the ArrayList called names.
 */
