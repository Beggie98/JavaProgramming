package String;

import java.util.Scanner;

public class PrintHalfTwice {
    /*
    Write a program that will print out first half of the word twice.


Example:

```
input: java

output: jaja
```
```
input: unity

output: unun
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        System.out.println(word.substring(0,word.length()/2) + word.substring(0,word.length()/2));

        input.close();
    }
}
