package Arrays;

import java.util.Scanner;

public class SplitSentence {
    /*
    Given a String variable **sentence,** write code to type each word in separate lines.

Example:

```
sentence -> "Java is fun"

Print

Java
is
fun
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");

        String sentence = input.nextLine();

        String[] arr = sentence.split(" ");

        for (String each : arr) {
            System.out.println(each);
        }
        input.close();
    }
}
