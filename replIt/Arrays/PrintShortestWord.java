package Arrays;

import java.util.Scanner;

public class PrintShortestWord {
    /*
    Write a program that will print the shortest word in the given array str.

```
input: java, cable, red, vivid, remedy, grace

output: red
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size");
        int size = input.nextInt();

        String[] words = new String[size];

        for (int i = 0; i < words.length; i++) {
            words[i] = input.next();
        }

        int min = words[0].length();
        String minWord = "";

        for (String word : words) {
            if (min > word.length()){
                min = word.length();
                minWord = word;
            }
        }
        System.out.println("minWord = " + minWord);
        input.close();

    }
}
