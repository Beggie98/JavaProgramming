package Statements;

import java.util.Scanner;
/*
**prices**
> 1 bedroom - 1100
> 2 bedroom - 1850
> 3 bedroom - 2550
 */
public class ApartmentLeasing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments\nNumber of bedrooms you are interested:");
        int numberOfBedrooms = input.nextInt();
        String result = "";
        int startingPrice = 0;

        switch (numberOfBedrooms){
            case 1: result = "One bedroom Selected";
                    startingPrice = 1100;
                    break;
            case 2: result = "Two bedroom Selected";
                    startingPrice = 1850;
                    break;
            case 3: result = "Three bedroom Selected";
                    startingPrice = 2550;
                    break;
            default: result = "No such Bedrooms available";
                    System.out.println(result);
                    System.exit(0);
        }
        System.out.println(result + "\nStarting Price: " + startingPrice);

        input.close();

    }
}
