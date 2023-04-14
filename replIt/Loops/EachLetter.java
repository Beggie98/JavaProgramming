package Loops;

import java.util.Scanner;

public class EachLetter {
    /*
    Given a String, use a loop to print every character from the String on a new line.

Examples:

```
Input: hello
h
e
l
l
o
```

```
Input: zimbabwe
z
i
m
b
a
b
w
e
```

```
Input: wow!
w
o
w
!
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

    }
}
