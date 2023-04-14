package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size for the list");
        int size = input.nextInt();

        ArrayList<String> words = new ArrayList<>();

        input.nextLine();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a word");
            words.add(input.nextLine());
        }

        System.out.println("Enter a word to search for");
        String find = input.next();

        System.out.println(search(words,find));
        input.close();

    }

    public static String search(ArrayList<String> list, String find){
        String result = "";

        for (String each : list) {
            if (each.contains(find)){
                return each;
            }
        }

        return "search failed";
    }

}
/*
The **search** method accepts `ArrayList of Strings` and `String find`.
The method returns a `String`.

It will look for an element within ArrayList that contains value of `find`

- if it finds it, methods needs to return whole Element value.
- if  an instance of find doesn't exist return:"search failed"

Example:

```
search(["one apple","two orange","four banana"],"four")

returns:
"four banana"

("four banana" contains "four" so method returns "four banana")
```
```
search(["hello","world"],"goodbye")

returns:
"search failed"

(no "goodbye" in any element)
```

hint: use `contains` string method to test if element has `word` value in it.


 */