package String;

import java.util.Scanner;

public class PrintFirstAndLastLetters {
    /*
    Write a program that will print out first and last letters together.

```
Input: adobe
```

```
Output: ae
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        System.out.println(word.charAt(0) + "" + word.charAt(word.length()-1));

        input.close();
    }
}
