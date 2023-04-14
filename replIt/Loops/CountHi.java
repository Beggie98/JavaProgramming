package Loops;

import java.util.Scanner;

public class CountHi {
    /*
    Print out the number of times that the string "hi" appears anywhere in the given string.
    Only lowercase "hi" should be counted.


Example:


```
input: abc hi how hi

output: 2
```


Example:


```
input: hi code java please

output: 1
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();
        int countHi = 0;

        while (sentence.contains("hi")){
            countHi++;
            sentence = sentence.replaceFirst("hi","");
        }

        System.out.println(countHi);
        input.close();


    }
}
