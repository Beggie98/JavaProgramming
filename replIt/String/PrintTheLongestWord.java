package String;

import java.util.Scanner;

public class PrintTheLongestWord {
    /*
    Write a program that will print out the longest word.
Note: Assume the length of the two given Strings will be different

```
input:
bill
check

```
```
output: check
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two words");
        String word1 = input.next();
        String word2 = input.next();
        String result = "";

        if (word1.length() > word2.length()){
            result = word1 + " is longer";
        } else if (word2.length() > word1.length()) {
            result = word2 + " is longer";
        }else {
            result = "Word have same length";
        }

        System.out.println(result);
        input.close();
    }
}
