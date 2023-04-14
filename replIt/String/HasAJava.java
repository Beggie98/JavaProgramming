package String;

import java.util.Scanner;

public class HasAJava {
    /*
    Given a string **_word_**, print true if "java" appears starting at index 0 or 1 in the string,
    such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.

    Example:

```
input: javapython

output: true
```

```
input: cjavac++

output: true
```

```
input: c#javaruby

output: false
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();

        if (word.length()>=4){
            boolean hasJava = word.substring(0,4).equals("java") || word.substring(1,5).equals("java");
            System.out.println(hasJava);
        }else{
            System.out.println("Too short");
        }
        input.close();
    }
}
