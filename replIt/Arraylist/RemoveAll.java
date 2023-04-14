package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many elements?");
        int size = input.nextInt();


        ArrayList<String> wordList = new ArrayList<String>();

        for (int i = 0; i < size; i++) {
            wordList.add(input.next());
        }
        System.out.println("Which word you want to eliminate?");
        String targetWord = input.next();

        System.out.println(removeAll(wordList,targetWord));

        input.close();
    }

    public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord){
        wordList.removeAll(Arrays.asList(targetWord));
        return wordList;
    }

}
/*
Create a static method that:

- is called `removeAll`
- returns `ArrayList<String>`
- takes two parameters: an `ArrayList` of `Strings` called `wordList`, and a `String` called `targetWord`

This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.

Example:

```
ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

removeAll(wordList,"hi");

wordList: ["hey","yo"]
```

 */