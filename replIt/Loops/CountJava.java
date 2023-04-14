package Loops;

import java.util.Scanner;

public class CountJava {
    /*
    Print the number of times that the string "java" appears anywhere in the given string **word**

Example:

```
input: javaxjava

output: 2
```


Example:


```
input: javaxjavaapplepearjavaegg

output: 3
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        String result = "";
        int countJava = 0;

        for (int i = 0; i <= word.length()-4; i++) {
            result = word.substring(i,i+4);
            if (result.equals("java")){
                countJava++;
            }
        }
        System.out.println(countJava);
        input.close();

    }
}
