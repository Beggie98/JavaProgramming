package Loops;

import java.util.Scanner;

public class EqualsJavaPython {
    /*
    Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to
    the number of appearances of "python" anywhere in the string (case sensitive).

Example:


```
input: We study java not python

output: true
```


Example:


```
input: What's the difference between java, javascript and python?

output: false
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();
        int countJava = 0;
        int countPython = 0;


        while (sentence.contains("java")){
            countJava++;
            sentence = sentence.replaceFirst("java","");
        }
        while (sentence.contains("python")){
            countPython++;
            sentence = sentence.replaceFirst("python","");
        }

        System.out.println(countJava == countPython);
        input.close();

    }
}
