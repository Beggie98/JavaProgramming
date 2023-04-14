package Methods;

public class ProfitOrLoss {
    public static void main(String[] args) {
        System.out.println(profits(2000,2000));
    }

    public static String profits(int buyPrice, int sellPrice){
        String result = "";

        if (buyPrice - sellPrice < 0){
            result = "loss";
        }else if (buyPrice - sellPrice > 0){
            result = "profit";
        }else {
            result = "no loss";
        }

        return result;
    }


}
/*
Finish the **profits** method which accepts the `buyPrice`(int) and `sellPrice`(int) and determines if there was a profit or loss.

It returns a string value that can be _"profit","loss","no loss"_

Example

```
profits(100,1500)

returns: "profit"
```

```
profits(20,5)

returns: "loss"
```

```
profits(100,100)

returns: "no loss"
```


 */