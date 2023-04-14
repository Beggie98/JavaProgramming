package String;

import java.util.Scanner;

public class MiddleThree {
    /*
    Given a String variable **word** print the middle three characters
    if the word is an odd number of characters and has more than 5 characters.
    If the word does not meet the requirements print invalid.
```
fifteen ==> fte
```

```
apple ==> ppl
```

```
hey ==> invalid
```

```
java ==> invalid
```

```
whatsup ==> ats
```

```
$ ==> invalid
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        String result = "";

        if (word.length()%2!=0) {
            if (word.length() >= 5) {
                result = word.substring(((word.length()/2)-1),(word.length()/2)+2);
            }else {
                result = "Invalid input";
            }
        }else {
            result = "Invalid input";
        }
        System.out.println(result);
        input.close();
    }
}
