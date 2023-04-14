package Loops;

import java.util.Scanner;

public class CountTriples {
    /*
    We'll say that a "triple" in a string is a char appearing three times in a row.
    Print out the number of triples in the given string. The triples may overlap.

Example:

```
input: abcXXXabc

output: 1
```

Example:

```
input: xxxabyyyycd

output: 3
```

Example:

```
input: java

output: 0
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        int count = 0;

        for (int i = 0; i < word.length()-2; i++) {
            char ch = word.charAt(i);
            char ch1 = word.charAt(i+1);
            char ch2 = word.charAt(i+2);

            if (ch == ch1 && ch1 == ch2){
                count++;
            }

        }
        System.out.println(count);
        input.close();
    }
}
