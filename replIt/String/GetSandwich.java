package String;

import java.util.Scanner;

public class GetSandwich {
    /*
    A sandwich is two pieces of bread with something in between. Print the string that is between the first and
     last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.


Example:

```
input: breadjambread

output: jam
```

```
input: xxbreadjambreadyy

output: jam
```

```
input: xxbreadapple

output: nothing
```

```
input: breadbutterbread

output: butter
```
     */
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();
        int frequency = 0;
        word = word.substring(word.indexOf("bread"),word.lastIndexOf("bread")+5);
        for (int i = 0; i < 2; i++) {
            if (word.contains("bread")){
                frequency++;
                word = word.replaceFirst("bread","");
            }
        }
        if (frequency==2){
            System.out.println(word);
        }else {
            System.out.println("Nothing");
        }
    }
}
