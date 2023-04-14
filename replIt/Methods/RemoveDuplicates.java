package Methods;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(uniqueChars(""));
    }

    public static String uniqueChars(String word){
        String result = "";

        System.out.println("Enter a word");
        word = new Scanner(System.in).next();

        for (char each : word.toCharArray()) {
            if (!result.contains("" + each)){
                result += each;
            }
        }

        return result;

    }


}
/*
**uniqueChars** is a method that will accept any String and return the String with out any dupclicate characters

Examples:

```
uniqueChars("java") ==> "jav"
```

```
uniqueChars("mama") ==> "ma"
```

```
uniqueChars("spoon") ==> "spon"
```

 */