package Methods;

import java.util.Scanner;

public class CleanString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text");
        String text = input.nextLine();

        System.out.println("Enter a word to remove");
        String badWord = input.next();
        System.out.println(cleanString(text, badWord));


        input.close();

    }

    public static String cleanString(String text, String badWord){
        while (text.contains(badWord + " ")){
            text = text.replaceFirst(badWord + " ","");
        }
        while (text.contains(badWord)){
            text = text.replaceFirst(badWord, "");
        }
        return text;
    }


}
/*
This method accept two strings (text and badWord) and returns a string.

The method will take out all the occurrences of badWord in the text.

Example:

```
clean ("one two three","two")

returns "one three"
```

```
clean ("foo bar","foo")

returns "bar"
```

```
clean ("he said bla bla bla","bla")

returns "he said"
```

 */