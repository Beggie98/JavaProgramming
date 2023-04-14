package Loops;

import java.util.Scanner;

public class PrintVowels {
    /*
    Create a program that will take the given String **In** and print out all the vowels from the String.

Example:

```
Input: howdyho

Output: oo
```

```
Input: huehuehuehue

Output: ueueueue
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.print((char)ch);
            }
        }
        input.close();

    }
}
