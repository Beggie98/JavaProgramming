package Arraylist;

import java.util.ArrayList;

public class AddInsert {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add(0,"hey");
        words.add("Hello");
        words.add("Sup");
        words.add("Buddy");
        words.add(3,"yo");

        System.out.println(words);
    }
}
/*
The last ArrayList method we are going to learn is... .add() again!

Except this time, instead of .add() taking one parameter (the thing we want to add), this time, we will be giving it two parameters.  The two parameters are:

```
.add(i,element)
```

```
i ==> the index you want to insert at

element ==> the element you want to insert at index i
```

For example, if you had an ArrayList called nums with the values (4,2,5,6), and you run the following:

```
nums.add(1,100);
```

The result will be (4,100,2,5,6)

Task: Given an ArrayList of Strings called words, insert "hey" in the 0th index and then insert "yo" in the 3rd index.
 */