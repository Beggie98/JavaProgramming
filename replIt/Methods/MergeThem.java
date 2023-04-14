package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MergeThem {
    public static void main(String[] args) {

    }


    public static String merge(String one, String two) {
        Scanner input = new Scanner(System.in);
        String result = "";
        System.out.println("Enter two words");
        one = input.next();
        two = input.next();

        return result;
    }
}
/*


Write a method **mergeStrings** that will return the strings merged, one letter at a time,
starting with `one`.   Please note `one` and `two` can be of different lengths.

Examples:
```
s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"
```

```
mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
```
 */
