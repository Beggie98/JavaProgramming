package Arrays;

public class PrintFirstAndLastChar {
    /*
    Given a String array words, iterate through each word and print first and
    last letter of each element in separate lines.

Example:

```
words → ["hello", "why", "by", "apple" , "note"]

print:
ho
wy
by
ae
ne
```
     */
    public static void main(String[] args) {
        String[] words = {"hello", "why", "by", "apple" , "note"};

        for (String word : words) {
            String firstLastLetter = "" + word.charAt(0) + word.charAt(word.length()-1);
            System.out.println(firstLastLetter);
        }


    }
}
