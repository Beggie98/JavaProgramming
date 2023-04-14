package OOP.person1Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Person person1 = new Person();
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());
        System.out.println(person1);

        System.out.println("Enter first name");
        String firstName = input.next();
        System.out.println("Enter last name");
        String lastName = input.next();
        System.out.println("Enter age");
        int age = input.nextInt();

        Person person2 = new Person(firstName,lastName,age);
        System.out.println(person2);

        input.close();

    }
}
/*
Examples:

```
Person person = new Person();
System.out.println(person.getFirstName()); //"undefined"
System.out.println(person.getLastName());  //"undefined"
System.out.println(person.getAge());       // -1
System.out.println(person.toString());     //"undefined | undefined | -1"
person.setFirstName("John");
person.setLastName("Doe");
person.setAge(44);
System.out.println(person.toString() ); // "John | Doe | 44"

```

```
Person person = new Person("Fatima", "Lee", 22);
System.out.println(person.getFirstName()); //"Fatima"
System.out.println(person.getLastName());  //"Lee"
System.out.println(person.getAge());       // 22
System.out.println(person.toString());     //"Fatima | Lee | 22"
```


 */