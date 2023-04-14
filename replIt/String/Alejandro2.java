package String;

public class Alejandro2 {
    /*
    Alejandro has many emails and only has time to read the emails that refer to him and a **project**.
    Check if his name is found in the email and if project is also included and if it does print "read",
    but if his name is not in the email print "don't read"

Example:

```
a = "dear alejandro.....alot of text"

output: "don't read"
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
        String email = " important project, alejandro we refer to you  this ....";
        String result = "";

        if (email.toLowerCase().contains("alejandro") && email.toLowerCase().contains("project")){
            result = "Read";
        }else{
            result = "Do not read";
        }

        System.out.println(result);
    }
}
