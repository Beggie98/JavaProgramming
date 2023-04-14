package Loops;

import java.util.Scanner;

public class RepeatSeparator {
    /*
    Given two strings, **word** and a separator **sep**, return a big string made of **count** occurrences of the word,
    separated by the separator string.

Example:

```
input:
Word
X
3

output: WordXWordXWord
```

Example:

```
input:
This
And
2

output: ThisAndThis
```

Example:

```
input:
This
And
1

output: This
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        System.out.println("Enter a separator");
        String sep = input.next();

        System.out.println("Enter number of word occurrences");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(word);
            if (i!=count){
                System.out.print(sep);
            }
        }


    }
}
