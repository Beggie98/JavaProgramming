package String;

import java.util.Scanner;

public class StringNoEnd {
    /*
    Given a String **txt** print the value without the last letter

Ex:

```
Input:
foo
```
```
Output:
fo
```

```
Input:
run
```
```
Output:
ru
```

Hint: Use substring() and length()
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String txt = input.next();

        System.out.println(txt.substring(0,txt.length()-1));


        input.close();
    }
}
