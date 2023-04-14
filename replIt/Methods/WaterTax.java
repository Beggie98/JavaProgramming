package Methods;

public class WaterTax {
    public static void main(String[] args) {
        System.out.println(waterTax(151));
    }


    public static double waterTax(double amount){
        if (amount<0){
            System.out.println("Invalid input");
            return amount;
        }

        double cost = 1;
        if (amount <= 50){
            cost = amount * 0.60;
        } else if (amount<=100) {
            cost = amount * 0.90;
        } else if (amount<=150) {
            cost = amount * 0.90 + 50;
        }else {
            cost = amount * 0.90 + 100;
        }


        return cost;

    }



}
/*
The **waterTax** method calculates a water bill. The method takes a double and returns a double.

The more water you use the more it will cost you

>Cost `under 50`:

```
bill = units * 0.60;
```

>Cost `above 50`:

```
bill = units * 0.90;
```

> Cost above 100 the calculation is same as `above 50` but an additional 50 fine

> Cost above 150 its the same as `above 50` but an additional 100 fine


Examples:

```
waterTax(50)

returns 30
```

```
waterTax(55)

returns 49.5
```

```
waterTax(101)

returns 140.9
```

```
waterTax(151)

returns 235.9
```


 */