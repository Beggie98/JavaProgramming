package Methods;


import java.util.Arrays;

public class SplitPerson {
    public static void main(String[] args) {
        person("Bekzod,Juraev,25");
    }

    public static void person(String info){
        String[] arr = info.split(",");

        System.out.println("Person name: " + arr[0]);
        System.out.println("Last name: " + arr[1]);
        System.out.println("Age: " + arr[2]);

    }

}
/*
The method **person** has a string arguement with this format:
"name,last name,age". Print out the person's information

Example:

```
person("jon,doe,30");

output:
person name: jon
last name: doe
age: 30
```

hint: use the `split` method to split the string to a string array where there is a "," char


 */