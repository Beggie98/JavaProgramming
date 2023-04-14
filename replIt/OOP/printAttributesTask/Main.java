package OOP.printAttributesTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Atts a = new Atts();
        System.out.println("Name: ");
        a.name = input.nextLine();
        System.out.println("Color: ");
        a.color = input.next();
        System.out.println("Amount: ");
        a.amount = input.nextInt();

        System.out.println(a.asString());
        input.close();

    }
}
/*
Atts a = new Atts();
   a.name = "table";
   a.color = "brown";
   a.amount = 1;

   System.out.println(a.asString());
```

Output

```
name: table color: brown amount: 1
```

 */