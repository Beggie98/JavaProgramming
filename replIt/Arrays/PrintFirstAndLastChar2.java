package Arrays;

import java.util.Arrays;

public class PrintFirstAndLastChar2 {
    /*
    Given a String array **words**, iterate through each word and print first and
    last letter of each element in the format below. Put each first and last letter in an array.

Example:

```
words → ["hello", "why", "by", "apple" , "note"]

print → [ho, wy, by, ae, ne]
```
     */
    public static void main(String[] args) {
        String[] words = {"hello", "why", "by", "apple" , "note"};

        String[] words1 = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            words1[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length()-1);
        }

        System.out.println(Arrays.toString(words1));
    }
}
