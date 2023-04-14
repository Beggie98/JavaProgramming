package Arrays;

import java.util.Scanner;

public class MaxLengthInStringArray {
    /*
    Given the array **words** find and print the word with the largest length.
    Assume that there are no 2 words with longest length

Example:
```
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a size");
        int size = input.nextInt();

        String[] words = new String[size];

        int maxLength = 0;
        String result = "";

        for (int i = 0; i < words.length; i++) {
            words[i] = input.next();
            if (words[i].length() > maxLength){
                maxLength = words[i].length();
                result = words[i];
            }
        }
        System.out.println(result);

    }
}
