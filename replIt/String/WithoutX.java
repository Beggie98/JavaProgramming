package String;

import java.util.Scanner;

public class WithoutX {
    /*
    Given a string word, if the first or last chars are 'x' or 'X',
    print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.


Example:

```
input: xHiX

output: Hi
```

```
input: apple

output: apple
```

```
input: xUxL

output: UxL
```

```
input: JavaX

output: Java
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        if (word.substring(0,1).equalsIgnoreCase("x") || word.substring(word.length()-1).equalsIgnoreCase("x")){
            System.out.println(word.substring(1,word.length()-1));
        }else {
            System.out.println(word);
        }

        input.close();
    }
}
