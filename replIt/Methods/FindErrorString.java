package Methods;

import java.util.Scanner;

public class FindErrorString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text");
        String text = input.nextLine();

        System.out.println(isError(text));
        input.close();
    }

    public static boolean isError(String text){
        if (text.startsWith("error")){
            return true;
        }
        return false;
    }

}
/*
The **isError** method checks if the given String begins with `error`

- The method will return `true` if the String starts with `error` otherwise it will return `false`

Example:

```
isError("foo bar")

returns : false
```

```
isError("error foo bar")

returns : true
```

```
isError("error one two")

returns : true
```

```
isError("three four error")

returns : false
```


 */