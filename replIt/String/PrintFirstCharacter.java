package String;

import java.util.Scanner;

public class PrintFirstCharacter {
    /*
    Write a program that will print out the first character of the word.

Ex:

```
Input: jump
```
```
Output: j
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        System.out.println(word.charAt(0));


        input.close();
    }
}
