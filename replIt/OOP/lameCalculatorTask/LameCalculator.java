package OOP.lameCalculatorTask;

public class LameCalculator {


    public int plus(int num1, int num2){
        return num1 + num2;
    }

    public int minus(int num1, int num2){
        return num1 - num2;
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public double divide(double num1, int num2){
        return num1 / num2;
    }

}
/*
The `LameCalculator` class has instance methods that can do simple math operations on two numbers.
Create the methods: `plus, minus, multiply and divide`.

All the methods get two ints then the method does the required math operation and returns the result as an int.

Example:

```
LameCalculator lc = new LameCalculator();

lc.plus(1,1)
returns:2

lc.minus(1,1)
returns:0

lc.multiply(2,1)
returns:2

lc.divide(10,2)
returns:5
```


 */