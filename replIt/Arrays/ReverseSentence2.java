package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence2 {
    /*
    Given a String variable **sentence,** write code to get each word and assign to String **reversed** in reverse order.

Example:

```
sentence -> Java is fun

reversed > fun is Java
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        String[] arr = sentence.split(" ");

        String reversed = "";

        for (int i=arr.length-1; i >= 0; i--) {
            reversed += arr[i] + " ";
        }

        System.out.println(reversed);

    }
}
