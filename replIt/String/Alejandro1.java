package String;

import java.util.Scanner;

public class Alejandro1 {
    /*
    Alejandro has many emails and only has time to read the emails that refer to him.
     Check if his name is found in the email and if it does print "read",
     but if his name is not in the email print "don't read"

Examples:

```
a = "dear alejandro.....alot of text"

output: "read"
```

```
a = "thunder blaz is the best drink in the galaxy..."

output: "don't read"
```

```
a = "subject : important project, alejandro we refer to you  this ...."

output: "read"
```

     */
    public static void main(String[] args) {
        String email = "important project,  we refer to you  this ....";
        String result = "";

       if (email.toLowerCase().contains("alejandro")){
           result = "Read";
       }else {
           result = "Do not read";
       }

        System.out.println(result);
    }
}
