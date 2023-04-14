package String;

import java.util.Scanner;

public class Words {/*
        In this assignment you are given two string variables word1 and word2.

Check if they are equal

_Comparison should be case sensitive. "java" and "JaVa" are not equal._

if they are equal output  "word1 equals word2"

otherwise output "word1 does not equal word2"

```
Input:
java
java

output:
word1 equals word2
```

```
Input:
foo
bar

output:
word1 does not equal word2
```
         */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();
        String result = "";

        if (word1.equals(word2)){
            result = "Word1 equals word2";
        }else {
            result = "Word1 does not equal word2";
        }

        System.out.println(result);
        input.close();

    }
}
