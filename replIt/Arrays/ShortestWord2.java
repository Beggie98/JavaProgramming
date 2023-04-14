package Arrays;

import java.util.Arrays;


public class ShortestWord2 {
    /*
Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.

> Hint: Split values by comma: split(", ");

```
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
```

     */
    public static void main(String[] args) {

        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        String[] arr = str.split(", ");
        System.out.println(Arrays.toString(arr));
        int min = arr[0].length();
        int i=0;

        String[] words = new String[0];
        for (String each : arr) {
            if (each.length() <= min) {
                min = each.length();
            }
        }

        String[] arrMin = new String[min];

        for (String each : arr) {
            if (each.length() == min){
                arrMin[i++] = each;
            }
        }

        Arrays.sort(arrMin);
        System.out.println(Arrays.toString(arrMin));

    }
}
