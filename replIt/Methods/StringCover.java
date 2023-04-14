package Methods;

import java.util.Scanner;

public class StringCover {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a text and a word");
        String main = input.nextLine();
        String coverMe = input.next();

        System.out.println(stringCover(main, coverMe));

    }

    public static String stringCover(String main, String coverMe){
        String result = "";

        if (main.contains(coverMe)){
            main = main.replaceAll(coverMe, "[" + coverMe + "]");
        }else {
            main = "[" + main + "]";
        }

        return main;
    }

}
/*
The **coverString** method will take 2 string parameters from the caller.

Your job is to write an important code that will :

- to search and find each appearance of `coverME` within `main`

- then surround it with square brackets [coverMe]

- if you cannot find the `coverME` within `main` then just return whole `main` itself covered [main].

- keep in mind that coverME value can be of any length.

Examples:

```
coverString("java methods", "me") ) ; ==> "java [me]thods"
```

```
coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
```

```
coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
```

```
coverString("apples", "pears") ) ; ==> "[apples]"
```



 */