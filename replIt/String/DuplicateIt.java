package String;

import java.util.Scanner;

public class DuplicateIt {
    /*
    You have 2 words

Print the first word, second word, second word, first word

```
Input:

one

two
```

```
Output:

onetwotwoone
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();

        System.out.println(word1 + word2 + word2 + word1);

        input.close();

    }
}
