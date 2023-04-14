package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size for the 1st array?");
        int size1 = input.nextInt();

        String[] array1 = new String[size1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.next();
        }

        System.out.println("Enter size for the 2nd array?");
        int size2 = input.nextInt();

        String[] array2 = new String[size2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.next();
        }

        System.out.println(combineRs(array1,array2));
        input.close();
    }


    public static ArrayList<String> combineRs(String[] arr1, String[] arr2){
        ArrayList<String> list = new ArrayList<>();

        for (String each : arr1) {
            list.add(each);
        }

        for (String each : arr2) {
            list.add(each);
        }

        return list;

    }


}
/*
Finish the **combineRs** method to combine the two given String arrays into one arraylist and return the arraylist.

for example:

```
combineRs(["f","o","o"],[" b","a","r"])

returns [f, o, o, b, a, r]
```

```
combineRs(["1","2","3"],["4"])

returns [1, 2, 3, 4]
```
 */