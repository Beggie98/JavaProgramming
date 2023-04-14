package String;

import java.util.Scanner;

public class MergeThem {
    /*
    You have 2 words, both of them have 3 characters.

If either of them does not have exactly 3 characters, print "cannot merge"

Merge their characters one by one and print together like below:

```
Input:
aok
lol

Output:
alookl
```

```
Input:
ear
pie

Output:
epaire
```

```
Input:
java
wow

Output:
cannot merge
```

hint:

_by inserting +""+ (empty string) between chars, you can concatenate char values._
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();
        String merge = "";
        if (word1.length()==3 && word2.length()==3){

            for (int i = 0; i < word2.length(); i++) {
                merge += word1.charAt(i) + "" + word2.charAt(i);
            }
        }else {
            System.out.println("Cannot merge them");
        }

        System.out.println(merge);

        input.close();
    }
}
