package String;

import java.util.Scanner;

public class MiddleOne {
    /*
    You have a word, do the following:
1. When word has **odd number of characters and:**
 - **3 or more characters, print middle letter**

```
      oak ==> a
```

```
      javav ==> v
```

- **Single character, print that character 3 times**

```
      # ==> ###
```

```
      q ==> qqq
```

2. When word has **even number of characters and**:

 - **4 or more characters**, print the middle 2 characters

```
     java ==> av
```

```
     apples ==> pl
```

```
     #$%^&* ==> %^
```

 - **2 characters,** print those 2 characters twice

```
      @@ ==>@@@@
```

```
      $$ ==>$$$$
```

```
      hi ==> hihi
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a text");
        String text = input.next();

        if (text.length()%2!=0){
            if (text.length()>=3){
                char middleChar = text.charAt(text.length()/2);
                System.out.println(middleChar);
            }else {
                for (int i = 0; i < 3; i++) {
                    System.out.print(text.charAt(0));
                }
            }
        }else {
            if (text.length() >= 4){
                String middleTwoChars = text.substring((text.length()/2)-1,(text.length()/2)+1);

                System.out.println(middleTwoChars);
            }else {
                for (int i = 0; i < 2; i++) {
                    System.out.print(text);
                }
            }
        }

        input.close();
    }
}
