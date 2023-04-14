package Loops;

import java.util.Scanner;

public class CatsAndDogs {
    /*
    Print true if the string _"cat"_ and _"dog"_ appear the same number of times in the given string _word_.


Example:

```
input: catdog
output: true
```

Example:

```
input: catcat
output: false
```

Example:

```
input: cat-cheetah-dog-cat
output: false
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        int countCat = 0;
        int countDog = 0;

        while (word.contains("cat")){
            countCat++;
            word = word.replaceFirst("cat","");
        }
        while (word.contains("dog")){
            countDog++;
            word = word.replaceFirst("dog","");
        }
        System.out.println(countCat==countDog);

    }
}
