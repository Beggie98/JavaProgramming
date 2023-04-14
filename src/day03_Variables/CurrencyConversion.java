package day03_Variables;

public class CurrencyConversion {

    public static void main(String[] args) {
        
        int dollar = 100;
        double lira = dollar * 8.41;
        double euro = dollar * 0.81;
        double ruble = dollar * 73.6;

        System.out.println("lira = " + lira);
        System.out.println("Dollar = " + dollar);
        System.out.println("Euro = " + euro);
        System.out.println("Ruble = " + ruble);

    }
    
}
/*
$1 = 8.41 liras
$1 = 0.81 euro
$1 = 73.6 rubles
 */