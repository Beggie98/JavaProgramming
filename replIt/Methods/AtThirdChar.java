package Methods;

import java.util.Scanner;

public class AtThirdChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        System.out.println(at3(word1,word2));

        input.close();

    }

    public static String at3(String word1, String word2){
        String result = "";
        result += word1.substring(0,3) + word2 + word1.substring(3);

        return result;
    }

}
/*
**at3** accepts two strings and returns a string.

The first string is the one that will be manipulated.
* At the 3rd char position of target you will insert the word argument.

Example:

```
at3("longword","foo")

return: "lonfoogword"
```
```
at3("blabla","a")

return: "blaabla"
```

 */